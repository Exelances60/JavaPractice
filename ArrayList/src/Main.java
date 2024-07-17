import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        ArrayList sayılar = new ArrayList();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(4);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(7);
        sayılar.add(8);
        for (int i = 0; i < sayılar.size(); i++) {
            System.out.println(sayılar.get(i));
        }*/
   /*     ArrayList<String> isimler = new ArrayList<String>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Deli");
        for (String isim : isimler) {
            System.out.println(isim);
        }*/
    /*    ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Ali", "Veli", "deneme@gmail.com"));
        customers.add(new Customer(2, "Deli", "Veli", "deneme2@gmail.com"));

        customers.remove(customers.get(0));
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }*/
        // HashMap
        // Key - Value
        // Key: 1, Value: Ali
        HashMap<Integer, String> cities = new HashMap<Integer, String>();
        cities.put(1, "Ankara");
        cities.put(2, "İstanbul");
        cities.put(3, "İzmir");
        for (Integer key : cities.keySet()) {
            System.out.println("Key: " + key + " Value: " + cities.get(key));
        }



    }
}