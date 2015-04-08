package com.company;

import com.sun.glass.ui.SystemClipboard;

public class Main {

    public static void main(String[] args1) {
        // write your code here
        //
        int x = 50;
        int y = 20;
        double d = 23.5;
        d = y / x;
        System.out.println(d);
        String s = "March";
        String s5 = s + "34";

        System.out.println("Sum of 256 and 3180 " + (256 + 3180));
        boolean b;

        //b = "1234".equals("1234");
        //System.out.println(b);
        int[] h1 = {10, 0, 0, 21, -5, 38};
        //System.out.print(h1);
        int i2 = h1[4];
        //System.out.print(h1[6] + ", " + h1[1] + ", " + h1[2] + ", " + h1[3] + ", " + h1[4] + ", " + h1[5] );
        //System.out.print(args1[1]);
        String[] s1 = {"1", "2", "3"};
        String[] s2 = {"a", "b", "c"};
        System.out.println(s1[0] + " - " + s2[0] + ","
                + s1[1] + " - " + s2[1] + ","
                + s1[2] + " - " + s2[2]);
        int a123=10;
        if (a123<15){ System.out.print("express done"); }
        else {System.out.print("express NOT done");}

        cDoor ddd = new cDoor(200);
        ddd.Close();
        System.out.println("Start HW:\n");

        //ProDoor bestDoor = new ProDoor(200);
        ProDoor door = new ProDoor(2000, 900, true, false);
        String doorInfo = door.toString();
        System.out.println("Door info:\n" + doorInfo);

        System.out.println("DOMASHKA 6.04");
        Stakan ss = new Stakan("Super");
        Stakan kk = new Stakan("Bigger");
        System.out.println("s: " + ss.imia);
        System.out.println("k: " + kk.imia);
        System.out.println("Stakan: " + Stakan.material);
        System.out.println("Stakan: " + Stakan.vysota);
       System.out.println("s: " + ss.procentZapolneniia());
        ss.nalit(30);
        System.out.println("s:(30) " + ss.procentZapolneniia());
    }
}
