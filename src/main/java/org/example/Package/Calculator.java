package org.example.Package;

import java.util.Scanner;
import java.util.logging.*;

public class Calculator {
        double x;
        double y;
        double result;
        char ch;
        Calculation c;
        Logger l = Logger.getLogger("com.api.jar");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int i;
        public void process() {
            x = s.nextDouble();
            result = x;
            do{
                l.info("Enter the Operation Symbol:");
                ch = s1.next().charAt(0);
                switch (ch) {
                    case '+':
                        y = s.nextDouble();
                        c = new Addition(result, y);
                        l.log(Level.INFO, c::calc);
                        result = c.result;
                        break;
                    case '-':
                        y = s.nextDouble();
                        c = new Subtraction(result, y);
                        l.log(Level.INFO, c::calc);
                        result = c.result;
                        break;
                    case '*':
                        y = s.nextDouble();
                        c = new Multiplication(result, y);
                        l.log(Level.INFO, c::calc);
                        result = c.result;
                        break;
                    case '/':
                        y = s.nextDouble();
                        c = new Division(result, y);
                        l.log(Level.INFO, c::calc);
                        result = c.result;
                        break;
                    default:
                        l.info("The Process is Completed.");
                        i=1;
                        break;
                }
            }while (i<1);
        }
}