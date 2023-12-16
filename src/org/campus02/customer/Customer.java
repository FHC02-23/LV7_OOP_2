package org.campus02.customer;

import java.util.ArrayList;


public class Customer extends Person {
    // Customer is-a Person
    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>(); // Achtung: Nullpointer-Exception
    // Customer has-a Address

    public Customer(int customerNumber, String firstName, String lastName) {
        super(42, firstName, lastName);

        this.customerNumber = customerNumber;

        addresses = new ArrayList<>();
    }



    public void addAddress(Address a) {
        addresses.add(a);
    }

    public void setLastName(String lastName) {
        super.lastName = lastName;
    }

    @Override
    public void getInfo() {
        System.out.println("This is a customer");
        super.getInfo();
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
        System.out.println("do Something ....");
        System.out.println("customerNumber = " + customerNumber);
        System.out.println("addresses = " + addresses);

        super.doSomething();
        //System.out.println("firstName = " + firstName);
        //System.out.println("lastName = " + lastName);
    }
}
