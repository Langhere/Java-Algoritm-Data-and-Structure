package com.program;

import com.myclass.circular;

public class Main {
    public static void main(String[] args) {
        circular data1 = new circular();
        data1.createfirstdata("Sorai", "Nadin Amizah");
        data1.display();
        System.out.println("Addfirst");
        data1.addfirst("Perempuan Gila", "Nadin Amizah");
        data1.display();
        data1.addlast("All I want", "Kodalaine");
        data1.display();
        System.out.println("add middle at 2");
        data1.addmiddle("Bertaut", "Nadin Amizah", 2);
        data1.display();
        System.out.println("Remove first");
        data1.removefirst();
        data1.display();
        System.out.println("remove last");
        data1.removelast();
        data1.display();
    }

}
