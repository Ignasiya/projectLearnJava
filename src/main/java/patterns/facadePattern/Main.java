package patterns.facadePattern;

import patterns.facadePattern.data.*;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(),
                new Tuner(),
                new Streaming(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );
        homeTheaterFacade.watchMovie("Безумный Макс");
        System.out.println("\n");
        homeTheaterFacade.endMovie();
    }
}
