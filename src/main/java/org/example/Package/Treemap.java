package org.example.Package;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treemap {
    TreeMap<Integer, String> t = new TreeMap<>();
    Logger l = Logger.getLogger("com.api.jar");
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    int n;
    int rollno;
    String name;
    int ch;
    void display() {
        do {
            l.info("Enter the Choice:\n1. Put Element\n2. Print the set\n3. Print the Separate values\n4. Replace Element\n5. Retrieve the element\n6. Check the element\n7. Remove the element\n8. Exit");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    l.info("Enter the Number of Student Details :");
                    n = s1.nextInt();
                    for (int i = 0; i < n; i++) {
                        l.info("Enter the Student No:");
                        rollno = i;
                        l.info("Enter the Student Name:");
                        name = s2.nextLine();
                        t.put(rollno, name);
                    }
                    break;
                case 2:
                    l.log(Level.INFO, () -> String.valueOf(t));
                    break;
                case 3:
                    l.log(Level.INFO, () -> String.valueOf(t.firstKey()));
                    l.log(Level.INFO, () -> String.valueOf(t.lastKey()));
                    l.log(Level.INFO, () -> String.valueOf(t.lastEntry()));
                    break;
                case 4:
                    l.info("select the replace key:");
                    int k = s1.nextInt();
                    l.info("select the replace element:");
                    String select = s2.nextLine();
                    l.info("Enter the replace element:");
                    String replace = s2.nextLine();
                    t.replace(k, select, replace);
                    break;
                case 5:
                    for (
                            Map.Entry<Integer, String> m : t.entrySet()) {
                        l.log(Level.INFO, () -> m.getKey() + " " + m.getValue());
                    }
                    break;
                case 6:
                    l.log(Level.INFO, () -> t.get(2));
                    break;
                case 7:
                    l.info("Enter the Remove element Position:");
                    int remove = s1.nextInt();
                    t.remove(remove);
                    break;
                default:
                    l.info("The process is completed.");
            }
        }while (ch<8);
    }
}
