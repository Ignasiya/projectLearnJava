package exceptions.seminar02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Константин=?
 * Иван=4
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
 * (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти
 * по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
 * Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее
 * исключение.Записать в тот же файл данные с замененными символами ?.
 */
public class Ex01 {
    public static void main(String[] args) {
        String filePatch = "C:\\Users\\Василий\\Documents\\practicecode\\ProjectJava\\JavaLearn\\src\\main\\resources\\text.txt";
        Map<String, String> result = readToFile(filePatch);
        change(result);
        writeToFile(result, filePatch);
    }

    public static Map<String, String> readToFile(String filePath) {
        Map<String, String> result = new HashMap<>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = buff.readLine()) != null) {
                String[] in = line.split("=");
                result.put(in[0], in[1]);
            }
        } catch (IOException e) {
            System.out.println("ошибка при чтении файла" + filePath);
        }
        return result;
    }

    public static void change(Map<String, String> list) {
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getValue().equals("?") && isNumeric(entry.getValue())) {
                throw new RuntimeException("Не число");
            } else if (entry.getValue().equals("?")) {
                entry.setValue(Integer.toString(entry.getKey().length()));
            }
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void writeToFile(Map<String, String> list, String filePath) {
        try {
            BufferedWriter buff = new BufferedWriter(new FileWriter(filePath, false));
            for (Map.Entry<String, String> entry : list.entrySet()) {
                buff.write(entry.getKey() + "=" + entry.getValue());
                buff.newLine();
            }
        } catch (IOException e) {
            System.out.println("ошибка при чтении файла" + filePath);
        }
        System.out.println("запись успешна");
    }
}
