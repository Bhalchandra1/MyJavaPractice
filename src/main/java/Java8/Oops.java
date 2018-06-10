package Java8;

import sun.util.PreHashedMap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by bhalchandra on 11/7/2017.
 */
public class Oops {
    public static void main(String[] ar){
        /*ClassA classA = new ClassB(5);
        try {
            classA.methodA();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        classA.staticMethod();

        ClassB classB = new ClassB(6);
        classB.methodA();
        classB.staticMethod();

        AbstractClass1 abstractClass1 = new ConcreteClass(7);
        abstractClass1.abstractMethod();

        int[][] a = {{123},{4,5,6}};
        int[][] b =a.clone();
        b[0][0] = 100;

        System.out.println(a[0][0]);
        System.out.println(b[0][0]);

        b[1] = new int[]{600,700,800};
        System.out.println(a[1][1]);
        System.out.println(b[1][1]);


        *//*Set<Short> set = new HashSet<>();
        for (short i=0;i<100;i++){
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set);*//*

        classB.methodB(new Integer(3),new Integer(4));

        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("1","abcd");
        map1.put("2","pqrs");
        map1.put("3","abcd");
/**/
        //System.out.println(Collections.max(map1));
        double x = Double.NaN;
        double y = 0;
        Double a = new Double(0);
        Double b = new Double(0);

        /*int p  = 565;
        Integer q = 565;
        Integer r = new Integer(565);
        Integer s = new Integer(565);
        Integer l = 565;*/

        int p  = 127;
        Integer q = 127;
        Integer r = new Integer(127);
        Integer s = new Integer(127);
        Integer l = 127;
        System.out.println(q.equals(p));
        System.out.println(q.equals(r));
        System.out.println(p == q);
        System.out.println(p == r);
        System.out.println(s == r);
        System.out.println(s.equals(r));

        /*System.out.println(q.equals(l));
        System.out.println(q == l);

        System.out.println(y == x);
        System.out.println(y == a);
        System.out.println(a.equals(y));
        System.out.println(a.equals(b));*/

        /*char m = 'A';
        //System.out.println(" test"+ (m == 65));

        char[] c = new char[1];
        c[0]= '0';*/
        //System.out.println(Integer.parseInt(c[0]).intValue() == 0);
    }
    public static String buildEvenOddSymbolSeparatedString(String number) {
        StringBuilder builder = new StringBuilder();
        char[] digitInChar = number.trim().toCharArray();
        boolean isPrinted = false;

        for (int i = 0; i < digitInChar.length; i++) {
            if (digitInChar[i] == '0') {
                builder.append(digitInChar[i]);
                isPrinted = false;
                continue;
            } else if ((i + 1 < digitInChar.length) &&
                    (Integer.valueOf(digitInChar[i]).intValue() % 2 == 0 && Integer.valueOf(digitInChar[i + 1]).intValue() % 2 == 0)
                    && digitInChar[i + 1] != '0') {
                if(!isPrinted) {
                    builder.append(digitInChar[i]).append("*").append(digitInChar[i + 1]);
                    isPrinted = true;
                }else {
                    builder.append("*").append(digitInChar[i + 1]);
                    isPrinted = true;
                }
                //i++;
            } else if ((i + 1 < digitInChar.length) &&
                    (Integer.valueOf(digitInChar[i]).intValue() % 2 != 0 && Integer.valueOf(digitInChar[i + 1]).intValue() % 2 != 0)) {
                if(!isPrinted) {
                    builder.append(digitInChar[i]).append("-").append(digitInChar[i + 1]);
                    isPrinted = true;
                }
                else {
                    builder.append("-").append(digitInChar[i + 1]);
                    isPrinted =true;
                }
            } else {
                builder.append(digitInChar[i]);
                isPrinted = false;
            }
        }
        return builder.toString();
    }

}

class ClassA {
    static int count=0;
    int counter=4;
    public void methodA() throws SQLException{
        System.out.println("In super method" + count + counter);
        staticMethod();

    }
    static void staticMethod(){
        System.out.println("In super static method" +count);
    }
    public void methodB(int a, int b){
        System.out.println("In sub primitive");
    }
}

class ClassB extends ClassA implements Interface  {
    int counter=2;
    static int count=1;
    public ClassB(int number){
        this.counter = number;
    }
    public void methodA(){
        System.out.println("In sub method"+count + counter);
    }

    public void methodB(Integer a, Integer b){
        System.out.println("In sub Wrapper");
    }
    static void staticMethod(){
        System.out.println("In sub static method");
    }
}

abstract class AbstractClass1{
    public AbstractClass1(){

    }
    abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass1{

    public ConcreteClass(int a){

    }
    @Override
    void abstractMethod() {
        System.out.println("In concrete");
    }
}

interface Interface{

}