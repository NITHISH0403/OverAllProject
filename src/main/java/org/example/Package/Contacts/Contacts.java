package org.example.Package.Contacts;

import java.util.Scanner;
import java.util.logging.*;


public class Contacts{
    Data head = null;
    int size;
    int n;
    String name;
    Long number;
    String eid;
    int ch;
    int index;
    Logger l = Logger.getLogger("com.api.jar");
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    public Contacts(){
        try {
            l.info("Enter the Number of Contacts insert:");
            n = s1.nextInt();
            for(int i = 0; i<n; i++) {
                l.info("Enter the Contact Name:");
                name = s2.nextLine();
                l.info("Enter the Contact Number:");
                number = s1.nextLong();
                l.info("Enter the Contact MailId:");
                eid = s2.nextLine();
                add(name, number, eid);
            }
        }catch(Exception e){
            l.info("Your Input is Mismatch.");
        }
    }
    public void process(){
        do {
            l.info("Enter Your Choice:\n1. Display the Contact\n2. Insert the new Contact\n3. Remove the contact\n4. Search the contact\n5. Exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1 -> print();
                case 2 -> {
                    l.info("Enter the Contact Name:");
                    name = s2.nextLine();
                    l.info("Enter the Contact Number:");
                    number = s1.nextLong();
                    l.info("Enter the Contact MailId:");
                    eid = s2.nextLine();
                    l.info("Enter the Position:");
                    index = s1.nextInt();
                    insert(name, number, eid, index);
                }
                case 3 -> {
                    l.info("Enter the Position:");
                    index = s1.nextInt();
                    remove(index);
                }
                case 4 -> {
                    l.info("Enter the Search Contact Name:");
                    String find = s2.nextLine();
                    search(find);
                }
                default -> l.info("The process is completed.");
            }
        }while (ch<5);
    }
    void add(String nm, long ph, String eid){
        Data node = new Data(nm, ph, eid);
        Data current;
        if(head == null){
            head = node;
        }
        else{
            current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }
    void insert(String nm, long ph, String eid, int index){
        Data node = new Data(nm, ph, eid);
        Data current;
        Data prev = null;
        if(index == 0){
            current = node;
            current.next = head;
            head = current;
        }
        else if(index > 0){
            current = head;
            for (int i =0; i<index; i++){
                prev = current;
                current = current.next;
            }
            node.next = current;
            prev.next = node;
        }
        size++;
    }
    void remove(int index){
        Data current = head;
        Data prev = null;
        if(index == 0){
            head = current.next;
        }
        else if (index > 0) {
            for(int i = 0; i<index; i++){
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
    }
    void search(String nm){
        Data current = head;
        StringBuilder search = new StringBuilder();
        int flag = 0;
        while (current != null){
            if(current.name.equals(nm))
                search.append( current.name + " " + current.phone + " " + current.email + " ");
            flag++;
            current = current.next;
        }
        if(flag != 0) {
            l.info("Your Search Contact is Found...");
            l.log(Level.INFO,()-> String.valueOf(search));
        }
        else {
            l.info("Your Search Contact is Not Found...");
        }
    }
    void print(){
        Data current = head;
        StringBuilder str = new StringBuilder();
        while (current != null){
            str.append(current.name + " " + current.phone + " " + current.email + " ");
            current = current.next;
        }
        l.log(Level.INFO,()-> String.valueOf(str));
    }
}
