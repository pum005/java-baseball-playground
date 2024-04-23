package baseball.model.numbergenerator;

import baseball.model.numbers.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{

    private Random rand = new Random();
    @Override
    public Numbers generateRandomNumber(int count) {
        List<Integer> answer = new ArrayList<>();

        while(answer.size() < count){
            int randomNumber = rand.nextInt(9) + 1;
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }
        Numbers answerNumbers = new Numbers(answer);

        return answerNumbers;
    }
}
