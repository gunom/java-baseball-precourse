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
        String input = view.inputNumber();
        BaseBallCount baseBallCount = model.checkCount(List.of(input.split("")));
        view.displayResult(baseBallCount.getStrike(), baseBallCount.getBall());
        return checkGameContinue(baseBallCount);
    }

    private boolean checkGameContinue(BaseBallCount baseBallCount) {
        if (baseBallCount.getStrike() == model.getNumberLength()) {
            return promptRestartGame();
        }
        return true;
    }

    private boolean promptRestartGame() {
        String restartOption = view.displayRestart();
        if ("2".equals(restartOption)) {
            return false;
        }
        model.reset();
        return true;
    }
}