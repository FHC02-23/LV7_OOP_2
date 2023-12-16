package org.campus02.app;

import org.campus02.customer.Address;
import org.campus02.customer.Customer;

public class DemoCustomerApp {

    public static void main(String[] args) {
        
        Customer customer = new Customer(43001, "Susi", "Sorglos");
        customer.addAddress(new Address("Körblergasse 3", "8010", "Graz", "Austria"));
        Address newAddress = new Address("Wienerstraße 1", "1010", "Wien", "Austria");
        customer.addAddress(newAddress);

        System.out.println("customer.toString() = " + customer.toString());


        customer.setLastName("Sorglos-2");
        customer.doSomething();


        customer.getInfo();

    }
}
