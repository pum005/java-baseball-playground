package baseball;

import baseball.controller.Game;
import baseball.model.numbergenerator.NumberGenerator;
import baseball.model.numbergenerator.RandomNumberGenerator;
import baseball.service.GameService;
import baseball.view.ConsoleInput;
import baseball.view.ConsoleOutput;
import baseball.view.Input;
import baseball.view.Output;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Input input = new ConsoleInput();
        Output output = new ConsoleOutput();
        GameService gameService = new GameService();

        Game game = new Game(randomNumberGenerator, input, output, gameService);
        game.init();
        game.play();
    }
}
