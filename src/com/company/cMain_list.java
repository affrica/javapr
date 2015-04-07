package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 01.04.15.
 */
public class cMain_list {

    public static void main(String[] args) {
    // creat list
        String[] s = {"Hello", "Class", "."};
        List<String> f = new ArrayList<String>();
        f.add("Privet");
        f.add("Klass");
        f.add("...");
        System.out.println(s[0]);
        System.out.println(s[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.size());
        System.out.println(s.length);
    }
}
