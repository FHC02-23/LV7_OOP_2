package org.campus02.customer;

public class Person {
    protected String firstName;
    protected String lastName;
    private int id;

    public Person(String lastName) {
        
        this.lastName = lastName;
    }
    public Person(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
                 
    }

    public void getInfo() {
        System.out.println("This is a Person");
    }

    public void doSomething() {
        System.out.println("id = " + id);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);   // soutv + TAB + weiterschreiben
    }
}
