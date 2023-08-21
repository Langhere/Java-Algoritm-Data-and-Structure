package com.program;

import com.myclass.Node;
import com.myclass.doublelinkedlist;

public class Main {

    public static void main(String[] args) {

        doublelinkedlist data1 = new doublelinkedlist();
        System.out.println("Create First");
        data1.createfirst("Anugrah Gilang Ramadhan", "F1D022034");
        data1.display();
        System.out.println("Add first");
        data1.addfirst("Yoraichi nakagawa", "F1D022100");
        data1.display();
        System.out.println("Add Last");
        data1.addlast("Inoichi masaki", "F1D02290");
        data1.display();
        System.out.println("add middle");
        data1.addmidle("Kimetsu No Yaiba", "F1D022900", 2);
        data1.display();
        System.out.println("add middle 2");
        data1.addmidle("Otsusuki Riyoma", "F1D022500", 3);
        data1.display();
        // System.out.println("Delete first");
        // data1.removefirst();
        // data1.display();
        // System.out.println("Delete Last");
        // data1.removelast();
        // data1.display();
        // data1.removemiddle(2);
        // data1.display();
        // System.out.println("Change First");
        // data1.changefirst("Surikami Jaili", "F1D0ohmyghost");
        // data1.display();
        System.out.println("Change Last");
        data1.changelast("Sinigami Yuruki", "F1D022350");
        data1.display();
        System.out.println("Change Middle");
        data1.changemiddle("Hatake Kakashi", "F1D0227650", 3);
        data1.display();

    }

}
