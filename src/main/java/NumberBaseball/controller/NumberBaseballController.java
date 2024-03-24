package NumberBaseball.controller;

import NumberBaseball.model.BaseBallCount;
import NumberBaseball.model.NumberBaseballModel;
import NumberBaseball.view.NumberBaseballView;

import java.util.List;

public class NumberBaseballController {
    private final NumberBaseballModel model;
    private final NumberBaseballView view;

    public NumberBaseballController(NumberBaseballModel model, NumberBaseballView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        boolean continueGame = true;
        while (continueGame) {
            continueGame = playRound();
        }
    }

    private boolean playRound() {
        try {
            String input = view.displayRound();
            InputValidator.isValid(input);
            BaseBallCount baseBallCount = model.checkCount(List.of(input.split("")));
            view.displayResult(baseBallCount.getStrike(), baseBallCount.getBall());
            return checkGameContinue(baseBallCount);
        } catch (Exception e) {
            view.displayErrorMessage(e.getMessage());
            return true;
        }
    }

    private boolean checkGameContinue(BaseBallCount baseBallCount) {
        if (baseBallCount.getStrike() == model.getNumberLength()) {
            return promptRestartGame();
        }
        return true;
    }

    private boolean promptRestartGame() {
        while (true) {
            try {
                return !checkRestartGame();
            } catch (Exception e) {
                view.displayErrorMessage(e.getMessage());
            }
        }
    }

    private boolean checkRestartGame() {
        String restartOption = view.displayRestart();
        InputValidator.isRestartValid(restartOption);
        if ("2".equals(restartOption)) {
            return true;
        }
        model.reset();
        return false;
    }
}