package org.example.overallpackage.connectionpool;

import java.util.logging.*;
import java.util.*;
public class ConnectionPool{
        Logger l = Logger.getLogger("com.api.jar");
        Scanner s = new Scanner(System.in);
        String  url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "root";

        public void connect() {
            Database d1 = Database.getInstance();

            l.info("Enter Your Choice \n 1.open \n 2.close");
            int ch = s.nextInt();
            switch (ch) {
                case 1 -> d1.openCon(url, user, pass);
                case 2 -> d1.closeCon();
                default -> l.info("The Program is stoped.");
            }
        }
}