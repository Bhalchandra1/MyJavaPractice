package hireVue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by bhalchandra on 11/17/2017.
 */
public class FindAdjacentEvenOdd {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            if (isInteger(line)) {
                System.out.println(buildEvenOddSymbolSeparatedString(line));
            }
        }
    }

    public static String buildEvenOddSymbolSeparatedString(String number) {
        StringBuilder builder = new StringBuilder();
        char[] digitInChar = number.trim().toCharArray();

        for (int i = 0; i < digitInChar.length; i++) {
            if (digitInChar[i] == '0') {
                builder.append(digitInChar[i]);
                continue;
            } else if ((i - 1 >= 0) &&
                    (Integer.valueOf(digitInChar[i]).intValue() % 2 == 0 && Integer.valueOf(digitInChar[i - 1]).intValue() % 2 == 0)
                    && digitInChar[i - 1] != '0') {
                builder.append("*").append(digitInChar[i]);
            } else if ((i - 1 >= 0) &&
                    (Integer.valueOf(digitInChar[i]).intValue() % 2 != 0 && Integer.valueOf(digitInChar[i - 1]).intValue() % 2 != 0)) {
                builder.append("-").append(digitInChar[i]);
            } else {
                builder.append(digitInChar[i]);
            }
        }
        return builder.toString();
    }

    public static boolean isInteger(String number) {
        return number.matches("[0-9]*");
    }
}
