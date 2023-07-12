package javaPLO.Seminar09.Ex03.Game.VersionGame;

import javaPLO.Seminar09.Ex03.Game.Answer;
import javaPLO.Seminar09.Ex03.Game.GameStatus;

// Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue, getGameStatus)
public interface Game {
    void start(int lengthWord, int countTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
