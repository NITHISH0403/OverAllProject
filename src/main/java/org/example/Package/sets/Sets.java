package org.example.Package.sets;

import java.util.Scanner;
import java.util.logging.Logger;

public class Sets {
        Scanner a1 = new Scanner(System.in);
        int ch;
        Logger l = Logger.getLogger("com.api.jar");

        public void process() {
            do {
                l.info("Enter your Choose \n1. Hashset \n2. Hashmap \n3. Treeset \n4. TreeMap\n5. Exit");
                ch = a1.nextInt();
                switch (ch) {
                    case 1:
                        Hashset hs = new Hashset();
                        hs.display();
                        break;
                    case 2:
                        Hashmap hm = new Hashmap();
                        hm.display();
                        break;
                    case 3:
                        Treeset ts = new Treeset();
                        ts.display();
                        break;
                    case 4:
                        Treemap tm = new Treemap();
                        tm.display();
                        break;
                    default:
                        l.info("The Program End.");
                        break;
                }
            }while (ch<5);
        }

}
