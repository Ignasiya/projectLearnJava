package exceptions.seminar03.homework.core.control;

import exceptions.seminar03.homework.core.model.Model;

public class Version1Control implements Control {
    @Override
    public void execute(String input) {
        new Model(input);
    }
}
