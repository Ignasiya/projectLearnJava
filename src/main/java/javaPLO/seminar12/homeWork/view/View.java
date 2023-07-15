package javaPLO.seminar12.homeWork.view;

import javaPLO.seminar12.homeWork.control.Control;

public interface View {
    /**
     * Open-closed principle открыт для расширения другими версиями view, закрыт для модификаций
     */
    public Control getControl();
    public void start(Control control);
}
