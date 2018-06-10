package Java8;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bhalchandra on 11/5/2017.
 */
public class SingletonByBillPugh {
    public static void main(String[] ar) throws CloneNotSupportedException {

        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance().clone());

    }
}
/* static block implementation
class MySingleton{
    private static MySingleton INSTANCE;
    private MySingleton(){}
    static{
        INSTANCE = new MySingleton();
    }
    public static MySingleton getInstance(){
        return INSTANCE;
    }
}*/

/*Double check locking lazy initialization
class MySingleton{
    private static MySingleton INSTANCE;
    private MySingleton(){}
    public static synchronized MySingleton getInstance(){
        if (INSTANCE == null) {
            synchronized (MySingleton.class){
                if (INSTANCE == null)
                INSTANCE = new MySingleton();
            }
        }
        return INSTANCE;
    }
}*/

//Bill PUgh implementation
class MySingleton{
    static int b =20;
    private MySingleton(){}
    private static class MySingletonHelper{
        private static final MySingleton INSTANCE=new MySingleton();
        MySingletonHelper(){
            System.out.println(b);
        }
    }
    public static synchronized MySingleton getInstance(){
        new MySingletonHelper();
        return MySingleton.MySingletonHelper.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return MySingletonHelper.INSTANCE;
    }
}

/*
Enum Implementation to avoid issue by reflection
class MySingleton {

    enum MySingletonEnum {
        INSTANCE;


        public static MySingletonEnum getInstance() {
            return INSTANCE;
            }
        }
    public static synchronized MySingletonEnum getInstance(){
        return MySingletonEnum.INSTANCE;
    }
}*/
