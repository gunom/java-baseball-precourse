package NumberBaseball.controller;

public class InputValidator {
    private static final String VALID_PATTERN = "\\d{3}";
    private static final String RESTART_VALID_PATTERN = "[1-2]";

    public static void isValid(String input) {
        if (input == null || !input.matches(VALID_PATTERN) || input.length() != 3)
            throw new IllegalArgumentException("[Error] 올바른 값을 입력해주세요.");
    }

    public static void isRestartValid(String input) {
        if (input == null || !input.matches(RESTART_VALID_PATTERN))
            throw new IllegalArgumentException("[Error] 올바른 값을 입력해주세요.");
    }
}
