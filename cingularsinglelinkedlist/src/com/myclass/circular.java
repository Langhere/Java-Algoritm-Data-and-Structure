package com.myclass;

public class circular extends Node {

    // create constructor
    public circular() {
        this.head = null;
        this.tail = null;
        this.next = null;
    }

    public void createfirst(String songTitle, String artist) {
        Node newnode = new Node();
        newnode.songTitle = songTitle;
        newnode.artist = artist;
        head = newnode;
        tail = newnode;
        tail.next = head;
    }

    public void addfirst(String songTitle, String artist) {
        Node newnode = new Node();
        newnode.songTitle = songTitle;
        newnode.artist = artist;
        tail.next = newnode;
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String songTitle, String artist) {
        Node newnode = new Node();
        newnode.songTitle = songTitle;
        newnode.artist = artist;
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }

    public void addmiddle(String songTitle, String artist, int place) {
        Node curent = head;
        Node newnode = new Node();
        newnode.songTitle = songTitle;
        newnode.artist = artist;
        int i = 1;
        while (i < (place - 1)) {
            curent = curent.next;
            i++;
        }
        newnode.next = curent.next;
        curent.next = newnode;
    }

    public void removefirts() {
        tail.next = head.next;
        head = head.next;
    }

    public void removelast() {
        Node curent = head;
        while (curent.next != tail) {
            curent = curent.next;
        }
        curent.next = head;
        tail = curent;
    }

    public void removemiddle(int place) {
        Node curent = head;
        int i = 1;
        while (i < (place - 1)) {
            curent = curent.next;
        }
        Node del = curent.next;
        curent.next = del.next;
        del = null;
    }

    public void changefirst(String songTitle, String artist) {
        head.songTitle = songTitle;
        head.artist = artist;
    }

    public void changelast(String songTitle, String artist) {
        tail.songTitle = songTitle;
        tail.artist = artist;
    }

    public void changemiddle(String songTitle, String artist, int place) {
        Node curent = head;
        int i = 1;
        while (i < place) {
            curent = curent.next;
            i++;
        }
        curent.songTitle = songTitle;
        curent.artist = artist;
    }

    public void display() {
        System.out.println("----------------SONG AND ARTIST---------------");
        Node curent = head;
        while (curent.next != head) {
            System.out.println(curent.songTitle + " - " + curent.artist);
            curent = curent.next;
        }
        System.out.println(curent.songTitle + " - " + curent.artist);
        System.out.println("----------------------------------------------");
    }

}
