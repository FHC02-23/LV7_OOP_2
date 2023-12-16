package org.campus02.hasenstall;

public class WeihnachtsHase extends Hase {
    public WeihnachtsHase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " ist ein Weihnachtshase und legt die Geschenke unter den Christbaum.");
    }

    public void schmueckeChristbaum(){
        System.out.println(name + " hilft beim Christbaum schmücken");
    }
}
