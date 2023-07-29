package exceptions.lesson03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\Василий\\Documents\\practicecode" +
                "\\ProjectJava\\JavaLearn\\src\\main\\resources\\warehouse.json");
             FileWriter fileWriter = new FileWriter("test")) {
            while (reader.ready()) {
                fileWriter.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("копирование успешно");
    }
}
