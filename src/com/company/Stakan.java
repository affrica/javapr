package com.company;

/**
 * Created by yana on 06.04.15.
 */
public class Stakan {

/*    s.nalit(30);
System.out.println("s: " + s.procentZapolneniia());
// s: 30
*/


public String imia;
public int procZapolneniia;
public static String material = "Bumaga";
public static int vysota = 10;

    public Stakan(String name ) {
        imia = name;
//        procZapolneniia = 0;
    }

    public int procentZapolneniia() {
        return procZapolneniia;
       }
//    public static String material() {
//        String res;
//        res = "Bumaga";
//        return res;
//    }

/*    public static int vysota() {
        int res;
        res = 10;
        return res;
    }*/

    public int nalit(int prc) {
        return procentZapolneniia() + prc ;
    }

}
