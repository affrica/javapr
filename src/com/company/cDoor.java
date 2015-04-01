package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class cDoor {
    public int hight;
    public boolean isOpened;
    public cDoor (int h){
        hight = h;
        isOpened = false;
    }
    public void Close() {isOpened=false;
        System.out.println("Closing door:\n" ); }

}
