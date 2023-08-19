package com.program;

import com.myclass.Node;
import com.myclass.Singlelinkedlist;

public class Main {
    public static void main(String[] args) {
        Singlelinkedlist data1 = new Singlelinkedlist(null, null);
        // System.out.println("create firts data");
        data1.createfirstdata("Anugrah Gilang Ramadhan", "F1D022034");
        // System.out.println("add data firts");
        data1.addfirts("Yoraichi", "F1D022032");
        // System.out.println("add data last");
        data1.addlast("Ikimonogakari", "F1D02290");
        // System.out.println("add middle");
        data1.addmiddle("Hentai yumy", "F1D09090", 2);
        data1.display();
        // data1.removefirst();
        // data1.display();
        // data1.removelast();
        // data1.display();
        // data1.removemiddle(3);
        // data1.display();
        // data1.changefirst("Kimihime", "F1D022100");
        // data1.display();
        // data1.changelast("Kimihime", "F1D022100");
        // data1.display();
        // data1.changemiddle("Siyesiyee", "F1D022200", 2);
        // data1.display();
    }

}
