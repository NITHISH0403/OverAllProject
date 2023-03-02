package org.example.Package.shape;

import java.util.logging.*;
import java.util.*;
import java.lang.*;

public class Shape{
        Logger l = Logger.getLogger("com.api.jar");
        Scanner s = new Scanner(System.in);
        String error = "The Class Not Found";
        public Triangle t;
        public Rectangle r;
        public Circle c;
        int ch;

        public void selection() {
            do{
                l.info("select your choice in \n1.Triangle \n2.Rectangle \n3.Circle \n4. Exit");
                ch = s.nextInt();
                if (ch == 1) {
                    l.info("Enter the Base value:");
                    int base = s.nextInt();

                    l.info("Enter the Height value:");
                    int height = s.nextInt();

                    l.info("Enter the Side1 value:");
                    int side1 = s.nextInt();

                    l.info("Enter the Side2 value:");
                    int side2 = s.nextInt();

                    try {
                        Class.forName("org.example.Package.Triangle");
                        t = new Triangle(base, height, side1, side2);
                        l.log(Level.INFO, () -> "the perimeter of Triangle :" + t.perimeter());
                        l.log(Level.INFO, () -> "the area of Triangle :" + t.area());
                    } catch (ClassNotFoundException e) {
                        l.log(Level.INFO, () -> error );
                    }
                } else if (ch == 2) {
                    l.info("Enter the width value:");
                    int width = s.nextInt();

                    l.info("Enter the length value:");
                    int length = s.nextInt();
                    try {
                        Class.forName("org.example.Package.Rectangle");
                        r = new Rectangle(width, length);
                        l.log(Level.INFO, () -> "the perimeter of Rectangle :" + r.perimeter());
                        l.log(Level.INFO, () -> "the area  of Rectangle:" + r.area());
                    } catch (ClassNotFoundException e) {
                        l.log(Level.INFO, () -> error );
                    }
                } else if (ch == 3) {
                    l.info("Enter the radius value:");
                    int radius = s.nextInt();
                    try {
                        Class.forName("org.example.Package.Circle");
                        c = new Circle(radius);
                        l.log(Level.INFO, () -> "the perimeter of Circle :" + c.perimeter());
                        l.log(Level.INFO, () -> "the area of Circle:" + c.area());
                    } catch (ClassNotFoundException e) {
                        l.log(Level.INFO, () -> error);
                    }
                } else {
                    l.info("Program is exit...");
                }
            }while (ch<4);
        }
}