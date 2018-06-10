import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.SynchronousQueue;

public class Array1 {
    public static void main(String[] args){
     int[] a = new int[5];
        int[] ab = new int[15];
        boolean[] bool = new boolean[5];
        String arr[] = new String[5];
        int[] b = {1,2,0,4,5};

        /**************************** copy by re-instantiating**********/
        //a = b ;

        /**************************** copy by for**********/
        /*for(int x=0;x<b.length;x++){
            a[x] = b[x];
        }*/
        /**************************** copy by arrays.copyOf**********/

        //a = Arrays.copyOf(b,b.length);

        /**************************** copy by system.arrayCopy**********/

       /// System.arraycopy(b,0,a,0,b.length);

        /**************************** copy by system.arrayCopy**********/

        /*a = b.clone();

        for(int i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
         a[2] = 10;
        System.out.println("\n"+b[2]);
         b[4] = 20;
        System.out.println(a[4]);

        if(System.out.printf("A") == null){

        }
        if(System.out.append("B") == null){

        }
        if(System.out.format("C") == null){

        }
*/

        String A = "hello";
        String B = "java";

        char[] aArr = A.toCharArray();
        char[] bArr = B.toCharArray();
    }
}
