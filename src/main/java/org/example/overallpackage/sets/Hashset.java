package org.example.overallpackage.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.*;

class Hashset{
    //creating a hashset
    HashSet<String> h = new HashSet<>();
    Scanner s1= new Scanner(System.in);
    Scanner s2= new Scanner(System.in);
    Logger l = Logger.getLogger("com.api.jar");
    String name;
    int ch;
    int n;
    void display() {
        do {
            l.info("Enter the Choice:\n1. Add Element\n2. set Size\n3. Print the set\n4. Remove Element\n5. Exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    l.info("Enter the Number of Student Details :");
                    n = s1.nextInt();
                    for (int i = 0; i < n; i++) {
                        l.info("Enter the Student Name:");
                        name = s2.nextLine();
                        h.add(name);
                    }
                    break;
                case 2:
                    l.log(Level.INFO, () -> "Size of Hashset:" + h.size());
                    break;
                case 3:
                    l.log(Level.INFO, () -> String.valueOf(h));
                    break;
                case 4:
                    l.info("Enter the Remove element:");
                    String r = s2.nextLine();
                    h.remove(r);
                    break;
                default:
                    l.info("The Process is Complete.");
            }
        }while (ch<5);
    }

}