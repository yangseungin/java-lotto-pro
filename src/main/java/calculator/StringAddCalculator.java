package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private static final String DEFAULT_DELIMITER = ",|:";
    private static final String CUSTOM_DELIMITER = "//(.)\n(.*)";
    private static final int DELIMITER_GROUP = 1;
    private static final int CUSTOM_INPUT_GROUP = 2;

    public static int splitAndSum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] split = getSplit(input);
        return sumNumbers(split);
    }

    private static String[] getSplit(String input) {
        Matcher matcher = Pattern.compile(CUSTOM_DELIMITER).matcher(input);
        if (matcher.find()) {
            String customDelimiter = matcher.group(DELIMITER_GROUP);
            return matcher.group(CUSTOM_INPUT_GROUP).split(customDelimiter);
        }

        return input.split(DEFAULT_DELIMITER);
    }

    private static int sumNumbers(String[] split) {
        int sum = 0;
        for (String str : split) {
            int number = getNumber(str);
            validNegativeNumber(number);
            sum += number;
        }
        return sum;
    }

    private static void validNegativeNumber(int number) {
        if (number < 0) {
            throw new RuntimeException("음수는 입력할 수 없습니다.");
        }
    }

    private static int getNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자가 아닙니다.");
        }
    }
}
