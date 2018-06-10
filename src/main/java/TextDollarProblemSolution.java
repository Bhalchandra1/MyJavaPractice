import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextDollarProblemSolution {
    private static String[] oneToNine= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private static final String[] tenToNineteen = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] multipleOfTens = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private static String[] multipleOfHundreds = {"Hundred","Thousand","Million","Billion","Trillion"};
    static String result="";
    static String currency = "Dollars";

    public static void main(String[] a){

        Scanner scanner = new Scanner(System.in);
        //long num = Long.valueOf(number);
        do {
            System.out.println("Enter number to convert");
            result = "";
            long num = scanner.nextLong();
            convertToText(num);
            System.out.println("do you want to continue ? Y/N");
            if(scanner.next().equalsIgnoreCase("N")){
                System.exit(0);
            }
        }while(true);
    }

    public static void convertToText(long num){
        List<String> groups = new ArrayList<>();
        if(num < 1000000000000000l) {
            while (num > 0) {
                if (num % 1000 != 0) {
                    groups.add(String.valueOf(num % 1000));
                } else
                    groups.add(String.valueOf(0));
                num = num / 1000;
            }


            for(int i = groups.size()-1;i>=0;i--){
                convertToHundredsFormat(groups.get(i));
                if((Integer.valueOf(groups.get(i)) != 0 && i != 0) && ( i < multipleOfHundreds.length ))
                    result += multipleOfHundreds[i];
            }


            System.out.println(result + currency);
        } else{
            System.out.println("Amount is greater than 999999999999999");
        }
    }
    public static void convertToHundredsFormat(String nums) {
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
