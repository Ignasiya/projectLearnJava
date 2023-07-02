package JavaPLO.Seminar09.Ex03.Game;
// Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue, getGameStatus)
public interface Game {
    void start(int lengthWord, int countTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
