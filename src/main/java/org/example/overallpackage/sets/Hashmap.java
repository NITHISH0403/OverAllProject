package org.example.overallpackage.sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {
    HashMap<Integer, String> h = new HashMap<>();
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Logger l = Logger.getLogger("com.api.jar");
    int rollno;
    String name;
    int ch;
    int n;

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
                        h.put(rollno, name);
                    }
                    break;
                case 2:
                    l.log(Level.INFO, () -> String.valueOf(h));
                    break;
                case 3:
                    l.log(Level.INFO, () -> "Keys : " + h.keySet());
                    l.log(Level.INFO, () -> "Values : " + h.values());
                    l.log(Level.INFO, () -> "Key-Value mapping: " + h.entrySet());
                    break;
                case 4:
                    l.info("select the replace key:");
                    int k = s1.nextInt();
                    l.info("select the replace element:");
                    String select = s2.nextLine();
                    l.info("Enter the replace element:");
                    String replace = s2.nextLine();
                    h.replace(k, select, replace);
                    break;
                case 5:
                    for (Map.Entry m: h.entrySet()) {
                        l.log(Level.INFO, () -> m.getKey() + " " + m.getValue());
                    }
                    break;
                case 6:
                    l.info("Enter the Position:");
                    int position = s1.nextInt();
                    l.log(Level.INFO, () -> h.get(position));
                    break;
                case 7:
                    l.info("Enter the Remove element Position:");
                    int remove = s1.nextInt();
                    h.remove(remove);
                    break;
                default:
                    l.info("The Process is Complete.");
            }
        } while (ch < 8);
    }
}
