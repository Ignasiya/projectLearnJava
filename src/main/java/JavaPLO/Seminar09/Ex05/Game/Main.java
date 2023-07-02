package JavaPLO.Seminar09.Ex05.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame game = new NumberGame();
        System.out.println(); // todo: comment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину слова: ");
        int lengthWord = scanner.nextInt();
        System.out.println("Введите количество попыток: ");
        int CountTry = scanner.nextInt();
        scanner.nextLine();
        game.start(lengthWord, CountTry);
        boolean isWin = false;
        boolean isFinish = false;
        while (!(isFinish || isWin)) {
            Answer answer = game.inputValue(scanner.nextLine());
            if (answer != null) System.out.println("answer = " + answer);
            isWin = game.getGameStatus() == GameStatus.WIN;
            isFinish = game.getGameStatus() == GameStatus.FINISH;
        }
        if (isWin) System.out.println("Вы победили!");
        else System.out.println("Вы проиграли...");
    }
}
