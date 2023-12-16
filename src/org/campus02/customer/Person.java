package org.campus02.customer;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doSomething() {
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);   // soutv + TAB + weiterschreiben
    }
}
