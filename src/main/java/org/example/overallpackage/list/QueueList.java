package org.example.overallpackage.list;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueList {
    Node head;
    int size;
    public Logger l = Logger.getLogger("com.api.jar");
    public QueueList(){
        head = null;
        size = 0;
    }
    void add(String value){
        Node node = new Node(value);
        Node current;
        if(head == null){
            head= node;
        }
        else{
            current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }
    void remove(){
        Node current = head;

        head = current.next;
        l.info("The remove value is:");
        l.info(current.Name);
    }

    void print(){
        Node current = this.head;
        StringBuilder str = new StringBuilder();
        if(current == null){
            l.info("Queue is empty!");
        }
        else{
            while(current != null ){
                str.append(current.Name).append(" ");
                current = current.next;
            }
            l.log(Level.INFO,()->str.toString());
        }
    }
    public void connect() {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int ch;
        do {
            l.info("Enter your choice\n1. Add the Element\n2. Print the Element\n3. Remove the Element\n4. Exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    l.info("Enter the Number of Details store in linkedlist:");
                    int n = s1.nextInt();
                    for (int i = 0; i < n; i++) {
                        l.info("Enter the Name:");
                        String addname = s2.nextLine();
                        add(addname);
                    }
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    remove();
                    break;
                default:
                    l.info("The Program is End.");
            }
        } while (ch < 5);
    }
}
