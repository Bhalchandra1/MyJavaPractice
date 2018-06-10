package hireVue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhalchandra on 11/17/2017.
 */
public class FindCommonSuffix {
    public static void main(String[] a) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        String[] strArr = new String[2];

        if ((line = bufferedReader.readLine()) != null) {
            strArr = line.trim().split("\\,");
        }
        if (strArr.length == 2) {
            System.out.println(findCommonSuffix(strArr[0], strArr[1]));
        }
    }

    public static String findCommonSuffix(String first, String second) {
        char[] firstArr = first.trim().toCharArray();
        char[] secondArr = second.trim().toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = firstArr.length - 1, j = secondArr.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (firstArr[i] == secondArr[j] || String.valueOf(firstArr[i]).equalsIgnoreCase(String.valueOf(secondArr[j]))) {
                list.add(firstArr[i]);
            } else {
                break;
            }
        }
        return buildStringFromArray(list);

    }

    public static String buildStringFromArray(List<Character> list) {
        StringBuilder builder = new StringBuilder();
        if (list.size() != 0)
            for (int i = list.size() - 1; i >= 0; i--) {
                builder.append(list.get(i));
            }
        else {
            builder.append("NULL");
        }
        return builder.toString();
    }
}


    /*public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }*/