package NumberBaseball.model;

import java.util.*;

public class NumberBaseballModel {
    private List<String> numbers = new ArrayList<>();
    private final int NUMBER_LENGTH = 3;
    private Set<Integer> numberSet = new HashSet<>();

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
}
