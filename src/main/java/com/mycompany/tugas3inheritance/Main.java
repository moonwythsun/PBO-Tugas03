package com.mycompany.tugas3inheritance;

import Atribut.KarakterHSR;
import Atribut.Husbando;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("        CONSTRUCTOR 1");
        System.out.println("====================================");

        KarakterHSR k1 = new KarakterHSR();

        System.out.println();

        System.out.println("====================================");
        System.out.println("        CONSTRUCTOR 2");
        System.out.println("====================================");

        KarakterHSR k2 = new KarakterHSR(
                "DH001",
                "Dan Heng"
        );

        k2.create();

        System.out.println(k2.read());

        k2.update();

        k2.delete();

        System.out.println();

        System.out.println("====================================");
        System.out.println("        CONSTRUCTOR 3");
        System.out.println("====================================");

        KarakterHSR k3 = new KarakterHSR(
                "SUN002",
                "Sunday",
                "Harmony",
                "Imaginary",
                5
        );

        k3.create();

        System.out.println(k3.read());

        k3.update();

        k3.delete();

        System.out.println();

        System.out.println("====================================");
        System.out.println("     SUBCLASS - HUSBANDO");
        System.out.println("====================================");

        Husbando h1 = new Husbando(
                "PH003",
                "Phainon",
                "Destruction",
                "Physical",
                5,
                "Amphoreus",
                "YES"
        );

        System.out.println();

        System.out.println("-- METHOD WARISAN DARI PARENT --");

        h1.create();

        System.out.println(h1.read());

        h1.update();

        h1.delete();

        System.out.println();

        System.out.println("-- METHOD TAMBAHAN SUBCLASS --");

        h1.infoKarakter();

        System.out.println();

        h1.statusKarakter();
    }
}