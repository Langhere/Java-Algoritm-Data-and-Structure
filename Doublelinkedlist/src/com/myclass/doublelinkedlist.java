package com.myclass;

public class doublelinkedlist extends Node {

    public doublelinkedlist() {
        this.head = null;
        this.tail = null;
    }

    public int count() {
        Node curent = head;
        int i = 0;
        while (curent != null) {
            i++;
            curent = curent.next;
        }

        return i;
    }

    public void createfirst(String nama, String nim) {
        Node newnode = new Node();
        newnode.nama = nama;
        newnode.nim = nim;
        head = newnode;
        tail = newnode;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
    }

    public void addfirst(String nama, String nim) {
        Node newnode = new Node();
        newnode.nama = nama;
        newnode.nim = nim;
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(String nama, String nim) {
        Node newnode = new Node();
        newnode.nama = nama;
        newnode.nim = nim;
        newnode.prev = tail;
        tail.next = newnode;
        tail = newnode;
    }

    public void addmidle(String nama, String nim, int place) {
        Node newnode = new Node();
        Node curent = head;
        newnode.nama = nama;
        newnode.nim = nim;
        int i = 1;
        if (place < 1) {
            System.out.println("Lol ga bener");
        }
        if (place == 1) {
            System.out.println("Pake argument addfirst aja ini mah");
        }

        while (i < (place - 1)) {
            curent = curent.next;
            i++;
        }
        newnode.next = curent.next;
        newnode.prev = curent;
        curent.next.prev = newnode;
        curent.next = newnode;
    }

    // remove data
    public void removefirst() {
        head = head.next;
        head.prev = null;
    }

    public void removelast() {
        tail = tail.prev;
        tail.next = null;
    }

    public void removemiddle(int place) {
        if (place < 1 && place > count()) {
            System.out.println("Masukin yang bener gan");
        }
        if (place == 1) {
            System.out.println("Use argument removefirst");
        }
        if (place == count()) {
            System.out.println("Use argument removelast");
        }
        Node curent = head;
        int i = 1;
        while (i < (place - 1)) {
            curent = curent.next;
            i++;
        }
        Node del = curent.next;
        curent.next = del.next;
        del.next.prev = curent;
        del.next = null;
        del.prev = null;
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

        int i = 1;
        if (place < 1 || place > count()) {
            System.out.println("Lol lebih");
        }
        if (place == 1) {
            System.out.println("User changefirst");
        }
        if (place == count()) {
            System.out.println("Use changelast");
        }
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
            System.out.println(i + 1 + ". " + curent.nim);
            i++;
            curent = curent.next;

        }
        System.out.println("Jumlah data : " + count());

    }

}
