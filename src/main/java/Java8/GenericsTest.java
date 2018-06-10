package Java8;


import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] ar){

        List<Customer> a = new ArrayList<>();
        a.add(new Customer(1));
        List<SpecialCustomer> ab = new ArrayList<>();
        System.out.print(printData(a,ab));
    }
    static <T,K extends T> K printData(List<T> d,List<K> a){
        a.add((K)d.get(0));
        return a.get(0);
    }
}
class Customer{
    int id;
    String name;

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SpecialCustomer extends Customer{
    String speciality;

    public SpecialCustomer(int id) {
        super(id);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}