package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD example", 700, "CD-R", 350);
        DVD dvd = new DVD("DVD example", 4700, "DVD-R", 1450);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeToDisc(275));
        System.out.println(dvd.writeToDisc(8000));

        System.out.println(cd.discReport());
        System.out.println(dvd.discReport());

    }
}
