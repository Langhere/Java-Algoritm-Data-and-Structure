package com.myclass;

public class Singlelinkedlist extends Node {

    public Singlelinkedlist(String nama, String nim) {
        this.nama = null;
        this.nim = null;
        this.tail = null;
        this.head = null;
    }

    public int count() {
        int i = 0;
        Node curent = head;
        while (curent != null) {
            curent = curent.next;
            i++;
        }
        return i;
    }

    // create first data
    public void createfirstdata(String nama, String nim) {
        Node newnode = new Node();
        newnode.nama = nama;
        newnode.nim = nim;
        head = newnode;
        tail = head;
        tail.next = null;
    }

    public void addfirts(String nama, String nim) {
        if (head == null) {
            System.out.println("Please Using createfirstdata argument");
        } else {
            Node newnode = new Node();
            newnode.nama = nama;
            newnode.nim = nim;
            head = newnode;
            newnode.next = tail;
            tail.next = null;
        }
    }

    public void addlast(String nama, String nim) {
        if (head == null) {
            System.out.println("Please Using createfirstdata argument");
        } else {
            Node newnode = new Node();
            newnode.nama = nama;
            newnode.nim = nim;
            Node curent = head;
            while (curent.next != null) {
                curent = curent.next;
            }
            curent.next = null;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void addmiddle(String nama, String nim, int place) {
        Node newnode = new Node();
        newnode.nama = nama;
        newnode.nim = nim;
        Node curent = head;
        if (place < 1 || place > count()) {
            System.out.println("This Not a middle to add, Please banget masukin yang bener gan");
        } else if (place == 1) {
            System.out.println("Ni urutan ke 1 gan, yg bener la");
        } else {
            int i = 1;
            while (i != (place - 1)) {
                curent = curent.next;
                i++;
            }
            newnode.next = curent.next;
            curent.next = newnode;
        }
    }

    // for delete data
    public void removefirst() {
        Node curent = head;
        head = curent.next;
        curent = null;
    }

    public void removelast() {
        Node curent = head;
        while (curent.next != tail) {
            curent = curent.next;
        }
        tail = curent;
        tail.next = null;
    }

    public void removemiddle(int place) {
        Node curent = head;
        Node before = new Node();
        Node delete = new Node();
        if (head == null) {
            System.out.println("Gada data nya gan");
        }
        if (place < 1 || place > count()) {
            System.out.println("This Not a middle to add, Please banget masukin yang bener gan");
        } else if (place == 1) {
            System.out.println("Ni urutan ke 1 gan, yg bener la");
        } else {
            int i = 1;
            while (i <= place) {
                if (i == place - 1) {
                    before = curent;
                }
                if (i == place) {
                    delete = curent;
                }
                curent = curent.next;
                i++;
            }
            before.next = delete.next;
            delete = null;
        }
    }

    // change data
    public void changefirst(String nama, String nim) {
        head.nama = nama;
        head.nim = nim;
    }

    public void changelast(String nama, String nim) {
        tail.nama = nama;
        tail.nim = nim;
    }

    public void changemiddle(String nama, String nim, int place) {
        Node curent = head;
        if (place == 1) {
            System.out.println("It's a first data, using argument changefirst");
        }
        if (place > count()) {
            System.out.println("It's over from data");
        }
        int i = 1;
        while (i < place) {
            curent = curent.next;
            i++;
        }
        curent.nama = nama;
        curent.nim = nim;
    }

    public void display() {
        Node curent = head;
        int i = 0;
        while (curent != null) {
            System.out.println(i + 1 + ". " + curent.nama);
            System.err.println(i + 1 + ". " + curent.nim);
            curent = curent.next;
            i++;
            count++;
        }
        System.out.println("jumlah data = " + count());
    }

}
