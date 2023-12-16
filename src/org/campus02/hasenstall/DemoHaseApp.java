package org.campus02.hasenstall;

import java.util.ArrayList;

public class DemoHaseApp {
    public static void main(String[] args) {

        Hase felix = new Hase("Felix");
        felix.fressen();
        felix.hoppeln();
        felix.schlafen();
        felix.verteilen();

        WeihnachtsHase santa = new WeihnachtsHase("Santa");
        santa.fressen();
        santa.verteilen();
        santa.schmueckeChristbaum();

        OsterHase hoppi = new OsterHase("Hoppi");
        hoppi.schlafen();
        hoppi.verteilen();


        // OsterHase is-a Hase
        // WeihnachtsHase is-a Hase
        System.out.println("------");
        Hase h = santa; // Up-Cast
        h.hoppeln();
        h.verteilen();

        //
        System.out.println("-----");
        System.out.println("füttern");
        ArrayList<Hase> hasenStall = new ArrayList<>();
        hasenStall.add(hoppi);
        hasenStall.add(santa);
        hasenStall.add(felix);

        for (Hase x : hasenStall) {
            x.fressen();
            x.verteilen();
        }

        // down-casting
        System.out.println("------");
        System.out.println("down casting");

        h.verteilen();
        WeihnachtsHase wh = (WeihnachtsHase) h;
        wh.schmueckeChristbaum();

        //OsterHase oh = (OsterHase) felix;
        //oh.verteilen();
    }
}
