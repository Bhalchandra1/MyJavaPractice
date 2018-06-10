package preparation;

/**
 * Created by bhalchandra on 1/5/2018.
 */
public class Test1 {
    public static void main(String[] ar){
        int i1=127;
        int i2= 127;
        System.out.println(i1==i2);

        int i3=1000;
        int i4= 1000;
        System.out.println(i3==i4);

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5==i6);

        Integer i7 = 1000;
        Integer i8 = 1000;
        System.out.println(i7==i8);

        Integer i9 = new Integer(1000);
        System.out.println(i8==i9);

        Integer i10 = new Integer(127);
        System.out.println(i5==i10);

        Integer i11 = Integer.valueOf(127);
        System.out.println(i5==i11);

        Integer i12 = Integer.valueOf(1000);
        System.out.println(i8==i12);


    }
}
