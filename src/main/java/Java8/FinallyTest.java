package Java8;

/**
 * Created by user on 11/5/2017.
 */
public class FinallyTest {
    public static void main(String[] ar){
       System.out.print(printReturn());
    }
    static int printReturn(){
        try{

            System.exit(0);
            return 0;
        }
        catch (Exception e){
            return 1;
        }
        finally {
            return 2;
        }
    }
}
