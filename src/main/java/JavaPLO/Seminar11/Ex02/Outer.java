package JavaPLO.Seminar11.Ex02;

public class Outer {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public void start() {
                System.out.println("Игра началась");
            }
        };
        System.out.println(game.getClass().getName());

        Game finish = new Game() {
            @Override
            public void start() {
                System.out.println("Игра закончилась");
            }
        };
        System.out.println(finish.getClass().getName());

        // если видит new Game(), то к Outer добалвется приписка $ + порядковый номер вызова
        // к Outer$1 implements Game
        // происходит овверрайд методов интрефейса
        // Outer game = new Outer();

        AbstractGame abstractGame = new AbstractGame() {
            @Override
            public void info() {
                System.out.println("информаци об игре");
            }
        };
        abstractGame.info();
    }
}
