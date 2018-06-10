package hireVue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by bhalchandra on 11/17/2017.
 */
public class Practice1 {
    public static void main(String[] a) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line=bufferedReader.readLine())!= null){
            System.out.println(squareNumbers(Integer.parseInt(line)));
        }
    }

    public static long squareNumbers(int number){
        return number * number;
    }
}
