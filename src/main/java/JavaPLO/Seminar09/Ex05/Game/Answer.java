package JavaPLO.Seminar09.Ex05.Game;

public class Answer {
    private int bulls;
    private int cows;

    public Answer(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public Answer() {
    }


    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    @Override
    public String toString() {
        return "коровы = " + bulls +
                ", коровы = " + cows;
    }
}
