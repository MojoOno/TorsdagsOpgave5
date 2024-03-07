package TaskOne;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        //We can either create the instances and add them to the list at below
        /*Customer customer1 = new Customer("Frederik", "Franck", "MojoOno");
        Customer customer2 = new Customer("Mathias","Falcho", "MilleniumFalcho");
        Customer customer3 = new Customer("André", "Samuelsen", "AndréTheDragon");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);*/

        //Or you can add and instansiate in the same line as below
        customerList.add(new Customer("Frederik", "Franck", "MojoOno"));
        customerList.add(new Customer("Mathias","Falcho", "TheMilleniumFalcho"));
        customerList.add(new Customer("André", "Samuelsen", "AndréTheDragon"));


        printCustomers(customerList);
    }

    public static void printCustomers(ArrayList<Customer> customerList){
        for(Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
