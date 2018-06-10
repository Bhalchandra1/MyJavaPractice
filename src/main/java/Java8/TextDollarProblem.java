package Java8;

import java.util.ArrayList;
import java.util.List;

public class TextDollarProblem {
    private static String[] oneToNine= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private static final String[] tenToNineteen = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] multipleOfTens = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private static String[] multipleOfHundreds = {"Hundred","Thousand","Million","Billion","Trillion"};
    //private static String hundred = "Hundred";
    static String result="";
    static String currency = "Dollars";

    public static void main(String[] a){
        String number = "100000200060901";
         long num = Long.valueOf(number);
        List<String> groups = new ArrayList<>();
        int len = number.length();
        /*if (len > 6) {
            groups.add(number.substring(len - 3));
            groups.add(number.substring(len - 6, len - 3));
            groups.add(number.substring(0, len - 6));
        } else if (len > 3) {
            groups.add(number.substring(len - 3));
            groups.add(number.substring(0, len - 3));
        } else {
            groups.add(number);
        }*/

        while (num > 0){
            if (num % 1000 != 0){
                groups.add(String.valueOf(num % 1000));
            }
            else
                groups.add(String.valueOf(0));
            num = num /1000;
        }

        for(int i = groups.size()-1;i>=0;i--){
            hundredify(groups.get(i));
            if((Integer.valueOf(groups.get(i)) != 0 && i != 0) && ( i < multipleOfHundreds.length ))
                result += multipleOfHundreds[i];
        }


        System.out.println(result + currency);
    }

    public static void hundredify(String nums) {
        boolean b = true;
        if (nums.length() == 3) {
            int val = Integer.parseInt(String.valueOf(nums.charAt(0)));
            if (val != 0) {
                result = result + oneToNine[val - 1] + multipleOfHundreds[0];
            }
            nums = nums.substring(1);
        }
        if (nums.length() == 2) {
            int val = Integer.parseInt(String.valueOf(nums.charAt(0)));
            if (val == 1) {
                b = false;
                int ones = Integer.parseInt(String.valueOf(nums.charAt(1)));
                result +=tenToNineteen[ones];
            } else if (val > 1) {
                result +=multipleOfTens[val - 2];
            }
            nums = nums.substring(1);
        }
        if (b) {
            int val = Integer.parseInt(String.valueOf(nums.charAt(0)));
            if (val != 0) {
                result += oneToNine[val - 1];
            }
        }
    }
}
