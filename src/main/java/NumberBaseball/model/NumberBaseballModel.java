package NumberBaseball.model;

import java.util.*;

public class NumberBaseballModel {
    private final List<String> numbers = new ArrayList<>();
    private final int NUMBER_LENGTH = 3;
    private final Set<Integer> numberSet = new HashSet<>();

    public NumberBaseballModel() {
        generateNumbers();
    }

    private void generateNumbers() {
        Random random = new Random();

        while (numberSet.size() < NUMBER_LENGTH) {
            int newNumber = random.nextInt(9) + 1;
            numberSet.add(newNumber);
        }

        for (Integer number : numberSet) {
            numbers.add(number.toString());
        }
    }

    public BaseBallCount checkCount(List<String> input) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (numbers.get(i).equals(input.get(i))) {
                strike++;
            }
            if (numberSet.contains(Integer.parseInt(input.get(i)))) {
                ball++;
            }
        }
        ball -= strike;
        return new BaseBallCount(strike, ball);
    }

    public void reset() {
        numbers.clear();
        numberSet.clear();
        generateNumbers();
    }

    public int getNumberLength() {
        return NUMBER_LENGTH;
    }
}
