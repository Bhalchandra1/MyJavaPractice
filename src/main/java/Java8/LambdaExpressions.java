package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by bhalchandra on 10/15/2017.
 */
public class LambdaExpressions {
    public static void main(String[] Ar){
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        Stream<String> stream = fruits.stream();
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equalsIgnoreCase("Apple");
            }
        };
        System.out.println(stream.anyMatch(p));

    }
}
