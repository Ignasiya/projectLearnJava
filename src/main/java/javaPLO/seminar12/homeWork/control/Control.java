package javaPLO.seminar12.homeWork.control;

import java.util.Scanner;

public interface Control {

    /**
     * Open-closed principle открыт для расширения другими версиями view, закрыт для модификаций
     */
    public void onExecute(int item, Scanner scanner);
    public int size();
}
