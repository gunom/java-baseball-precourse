package NumberBaseball.view;

import java.util.Scanner;

public class NumberBaseballView {
    public String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }
}
