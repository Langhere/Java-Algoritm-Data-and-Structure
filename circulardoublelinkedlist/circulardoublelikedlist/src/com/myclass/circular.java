package com.myclass;

public class circular extends Node {

    public circular() {
        this.head = null;
        this.tail = null;
    }

    public void createfirstdata(String title, String artist) {
        Node newnode = new Node();
        newnode.title = title;
        newnode.artist = artist;
        head = newnode;
        tail = newnode;
        tail.next = head;
        head.prev = tail;
    }

    public void addfirst(String title, String artist) {
        Node newnode = new Node();
        newnode.title = title;
        newnode.artist = artist;
        newnode.next = head;
        newnode.prev = tail;
        tail.next = newnode;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(String title, String artist) {
        Node newnode = new Node();
        newnode.title = title;
        newnode.artist = artist;
        newnode.next = head;
        newnode.prev = tail;
        tail.next = newnode;
        head.prev = newnode;
        tail = newnode;
    }

    public void addmiddle(String title, String artist, int place) {
        int i = 1;
        Node curent = head;
        Node newnode = new Node();
        newnode.title = title;
        newnode.artist = artist;
        while (i < (place - 1)) {
            curent = curent.next;
            i++;
        }
        newnode.next = curent.next;
        curent.next = newnode;
        curent.next.prev = newnode;
        newnode.prev = curent;
    }

    public void removefirst() {
        Node del = tail.next;
        del.next.prev = tail;
        head = head.next;
        tail.next = head;
        head.prev = tail;
        del.prev = null;
        del.next = null;
    }

    public void removelast() {
        Node del = tail.prev;
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        // del.next = null;
        // del.next = null;

    }

    public void display() {
        Node current = head;
        System.out.println("--------------------SONG AND TITLE--------------------");
        do {
            System.out.println(current.title + " - " + current.artist);
            current = current.next;
        } while (current != head);
        System.out.println("------------------------------------------------------");
       
    }

}
