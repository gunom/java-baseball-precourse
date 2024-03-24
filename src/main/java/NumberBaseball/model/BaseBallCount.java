package NumberBaseball.model;

public class BaseBallCount {
    private int strike;
    private int ball;

    public BaseBallCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
