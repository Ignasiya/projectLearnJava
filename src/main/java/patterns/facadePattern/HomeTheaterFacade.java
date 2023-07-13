package patterns.facadePattern;

import patterns.facadePattern.data.*;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    Streaming player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             Streaming player,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Приготовьтесь смотреть кино...");
        popper.on();
        popper.pop();
        lights.off();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.Volume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Закрытие кинотеатра...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}
