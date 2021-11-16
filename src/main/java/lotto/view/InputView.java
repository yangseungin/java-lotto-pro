package lotto.view;

import lotto.consts.PriceConst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner sc;

    public InputView() {
        sc = new Scanner(System.in);
    }

    public void printPriceMessage() {
        System.out.println("구입 금액을 입력해 주세요. 최소 금액은 " + PriceConst.LOTTO_PRICE + "원입니다.");
    }

    public void printWinningLottoMessage() {
        System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
    }

    public void printErrorMessage() {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }

    public int inputPrice() {
        return getNumber(sc.nextLine());
    }

    public List<Integer> inputWinningLotto() {
        return getNumbers(sc.nextLine());
    }

    private int getNumber(String input) {
        return Integer.parseInt(input.trim());
    }

    private List<Integer> getNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] strNumbers = input.split(",");
        for (String strNumber : strNumbers) {
            numbers.add(getNumber(strNumber));
        }
        return numbers;
    }
}
