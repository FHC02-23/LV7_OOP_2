package org.campus02.app;

import org.campus02.customer.Address;
import org.campus02.customer.Customer;

public class DemoCustomerApp {

    public static void main(String[] args) {
        
        Customer customer = new Customer(43001, "Susi", "Sorglos");
        customer.addAddress(new Address("Körblergasse 3", "8010", "Graz", "Austria"));

        System.out.println("customer.toString() = " + customer.toString());


        customer.setLastName("Sorglos-2");
        customer.doSomething();
    }
}
