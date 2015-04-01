package com.company;

/**
 * Created by yana on 01.04.15.
 */
/*
ProDoor door = new ProDoor(2000, 900, true, false);
String doorInfo = door.toString();
System.out.println("Door info:\n" + doorInfo);
// Door info:
// Size: 2000x900 mm
// Opened: yes
// Locked: no

*/
public class ProDoor {
    public int hight;
    public int weight;
    public boolean isOpened;
    public boolean isLocked;

    public ProDoor(int h, int w, boolean isO, boolean isL) {
        hight = h;
        weight = w;
        isOpened = isO;
        isLocked = isL;
    }

    public String toString() {
        String res;
        String o, l;
        o=(isOpened ? "yes":"no");
        l=(isLocked ? "yes":"no");
        /*if (isOpened) {o="yes";}
        else {o="no";}
        if (isLocked) {l="yes";}
        else {l="no";}
        */
        res = "Size: "+Integer.toString(hight)+"x"+Integer.toString(weight) + " mm"+ "\n" +
              "Opened: "+ o + "\n"+
              "Locked: "+ l +"\n";
        return res;
    }

    public void Close() {
        isOpened = false;
        //System.out.println("Closing door:\n");
    }
    //public doClose1();
}
