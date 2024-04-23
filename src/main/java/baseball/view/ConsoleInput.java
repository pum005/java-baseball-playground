package baseball.view;

import baseball.model.numbers.Numbers;
import baseball.utills.constants.Constants;
import baseball.utills.validator.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleInput implements Input {

    private Scanner console = new Scanner(System.in);
    @Override
    public Numbers getNumber() {
        System.out.print(Constants.INPUT_PALCE_HOLDER);
        String input = console.nextLine();
        Validator.validateUserInput(input);
        Numbers Number = toNumbers(input);
        return Number;
    }

    @Override
    public int getOneOrTwo() {
        System.out.println(Constants.RESTART_MESSAGE);
        String input = console.nextLine();
        Validator.validateOneOrTwo(input);
        return Integer.parseInt(input);
    }

    public Numbers toNumbers(String input) {
        String[] numbers = input.split("");

        List<Integer> list = Arrays.stream(numbers).map(Integer::parseInt).collect(Collectors.toList());
        return new Numbers(list);
    }
}
