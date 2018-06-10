package Java8;

import java.util.*;

/**
 * Created by bhalchandra on 11/12/2017.
 */
public class StringPermutation {
    static int count =  1;
    public static void main(String[] ar){
        String str ="ABCDA";
        Permutation permutation = new Permutation();
        permutation.permute(str,0,str.length()-1);

        permutation.strings.stream().forEach(s -> System.out.println(count++ + s));
        List list = new ArrayList<>();
        list.listIterator();

        Map map = new HashMap<>();

    }
}

class Permutation{
    static int count = 0;
    Set<String> strings = new HashSet<>();


    public void permute(String str, int start, int end){
        if(start == end){
           System.out.println( count++ + str);
            strings.add(str);
        }
        else {
            for (int i = start;i<=end; i++){
                str = swap(str,start,i);
                permute(str,start +1 ,end);
                //str = swap(str,start,i); //No idea why we need second swap call
            }
        }
    }

    public static String swap(String str,int i,int j){
        char[] arr = str.toCharArray();
        char a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;

        return String.valueOf(arr);
    }
}
