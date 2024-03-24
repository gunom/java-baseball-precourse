package NumberBaseball;

import NumberBaseball.controller.NumberBaseballController;
import NumberBaseball.model.NumberBaseballModel;
import NumberBaseball.view.NumberBaseballView;

public class NumberBaseball {
    public static void main(String[] args) {
        NumberBaseballModel model = new NumberBaseballModel();
        NumberBaseballView view = new NumberBaseballView();

        NumberBaseballController numberBaseballController = new NumberBaseballController(model, view);
        numberBaseballController.startGame();
    }
}
