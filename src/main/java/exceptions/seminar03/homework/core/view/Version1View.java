package exceptions.seminar03.homework.core.view;

import exceptions.seminar03.homework.core.control.Control;
import exceptions.seminar03.homework.core.control.Version1Control;

import java.util.Scanner;

public class Version1View implements View {
    private final Control control;

    public Version1View() {
        this.control = new Version1Control();
    }

    @Override
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        while (true) {
            System.out.println("""
                    Введите данные в произвольном порядке, разделенные пробелом:
                    <ФИО дд.мм.гггг 0123456789 f|m>
                    введите [exit] для выхода""");
            String input = in.next();
            if (input.equalsIgnoreCase("exit")) System.exit(0);
            this.control.execute(input);
        }
    }
}
