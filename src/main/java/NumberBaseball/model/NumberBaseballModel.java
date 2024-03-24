package NumberBaseball.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class NumberBaseballModel {
    private String numbers;
    private final int NUMBER_LENGTH = 3;
    private Set<Integer> numberSet = new HashSet<>();

    public NumberBaseballModel() {
        generateNumbers();
    }

    private void generateNumbers() {
        Set<Integer> generatedNumbers = new LinkedHashSet<>();
        Random random = new Random();

        while (generatedNumbers.size() < NUMBER_LENGTH) {
            int newNumber = random.nextInt(9) + 1;
            generatedNumbers.add(newNumber);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer number : generatedNumbers) {
            sb.append(number);
        }
        numbers = sb.toString();
    }
}
