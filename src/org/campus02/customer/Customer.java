package org.campus02.customer;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(int customerNumber, String firstName, String lastName) {
        super(firstName, lastName);

        this.customerNumber = customerNumber;

    }



    public void addAddress(Address furtherAddress) {
        addresses.add(furtherAddress);
    }

    public void setLastName(String lastName) {
        super.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void doSomething() {
        System.out.println("customerNumber = " + customerNumber);
        System.out.println("addresses = " + addresses);
        super.doSomething();
        //System.out.println("firstName = " + firstName);
        //System.out.println("lastName = " + lastName);
    }
}
