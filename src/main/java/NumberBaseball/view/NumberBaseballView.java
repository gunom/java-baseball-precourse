package NumberBaseball.view;

import java.util.Scanner;

public class NumberBaseballView {
    public String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

    public void displayResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
            return;
        }

        String result = "";
        if (strike > 0) result += strike + "스트라이크 ";
        if (ball > 0) result += ball + "볼";
        System.out.println(result);
    }

    public String displayRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
