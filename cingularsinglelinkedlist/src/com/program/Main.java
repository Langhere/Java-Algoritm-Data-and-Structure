package com.program;

import com.myclass.circular;

public class Main {

    public static void main(String[] args) {
        circular data1 = new circular();
        data1.createfirst("It Will Rain", "Bruno Mars");
        data1.display();
        System.out.println("Its add first");
        data1.addfirst("Perempuan Gila", "Nadin Amizah");
        data1.display();
        System.out.println("Its add last");
        data1.addlast("Sorai", "Nadin Amizah");
        data1.display();
        System.out.println("Its add middle, add data to 2 place");
        data1.addmiddle("All i ask", "Adelle", 2);
        data1.display();
        // System.out.println("Remove first");
        // data1.removefirts();
        // data1.display();
        // System.out.println("Remove last");
        // data1.removelast();
        // data1.display();
        // System.out.println("Remove middle at 2");
        // data1.removemiddle(2);
        // data1.display();

        System.out.println("Change middle at 2");
        data1.changemiddle("Yang Terdalam", "Noah", 2);
        data1.display();
    }

}
