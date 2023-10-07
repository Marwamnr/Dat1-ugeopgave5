import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Marwa", "Mounir", "Marw0190", 10);
        Customer customer2 = new Customer("Michella", "Bech", "Mich1234", 20);
        Customer customer3 = new Customer("Maria", "Nørmøller", "Mari3030", 30);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        //Using method
        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers) {
        for(Object customer : customers) {
            System.out.println(customer);
        }
    }
}