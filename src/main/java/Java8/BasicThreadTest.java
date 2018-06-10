package Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by user on 11/5/2017.
 */
public class BasicThreadTest {
    public static void main(String[] ar){
        MyThreadByThread thread1 = new MyThreadByThread();
        thread1.start();
        Thread thread2 = new Thread(new MyThreadByRunnable());
        thread2.start();

        new Thread(){
            public void run(){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }
    /*
    * @param a string which we wanted to ocnvert to Uppercase
    * @return upper case string
    * */
    static String printLines(String a){
        return a.toUpperCase();
    }
}
class MyThreadByThread extends Thread{
    @Override
    public void run(){
        System.out.println("Using thread...");
        for(int i =0; i< 10; i++){
            System.out.print(" "+i);
        }
    }
}
class MyThreadByRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(" \n Using runnable...");
        for(int i =0; i< 10; i++){
            System.out.print(" "+i);
        }
    }
}
