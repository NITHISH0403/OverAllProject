package org.example;

import org.example.Package.BankAccount.BankAccount;
import org.example.Package.Calculator.Calculator;
import org.example.Package.ConnectionPool.ConnectionPool;
import org.example.Package.Contacts.Contacts;
import org.example.Package.CreditCard.CreditCard;
import org.example.Package.Frequency.Frequency;
import org.example.Package.List.LinkedList;
import org.example.Package.List.QueueList;
import org.example.Package.Point.BasicPoint;
import org.example.Package.Sets.Sets;
import org.example.Package.Shape.Shape;
import org.example.Package.Student.Student;
import org.example.Package.StudentDetails.StudentDetails;
import org.example.Package.Tictactoc.Tictactoc;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        int ch;
        Scanner s = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        while (true) {
            l.info("Enter the Which Program is Run: \n1. BankAccount\n2. Basic Shape\n3. Student\n4. Connection Pool" +
                    "\n5. Point in 2D Space\n6. Credit Card\n7. Student Details\n8. DataStructure\n9. Sets\n10. Calculation" +
                    "\n11. Contacts\n12. Frequency\n13. Tic_Tac_Toc");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    BankAccount bank = new BankAccount();
                    bank.payment();
                    break;
                case 2:
                    Shape shape = new Shape();
                    shape.selection();
                    break;
                case 3:
                    Student student = new Student();
                    student.update();
                    break;
                case 4:
                    ConnectionPool connection = new ConnectionPool();
                    connection.connect();
                    break;
                case 5:
                    BasicPoint point = new BasicPoint();
                    point.process();
                    break;
                case 6:
                    CreditCard card = new CreditCard();
                    card.credit();
                    break;
                case 7:
                    StudentDetails details = new StudentDetails();
                    details.test();
                    break;
                case 8:
                    l.info("Enter the Data Structure type:\n1. LinkedList\n2. Queue");
                    int ch1 = s.nextInt();
                    if(ch1==1) {
                        LinkedList linklist = new LinkedList();
                        linklist.connect();
                    } else if (ch1==2) {
                        QueueList queue = new QueueList();
                        queue.connect();
                    }
                    break;
                case 9:
                    Sets set = new Sets();
                    set.process();
                    break;
                case 10:
                    Calculator cal = new Calculator();
                    cal.process();
                    break;
                case 11:
                    Contacts contact = new Contacts();
                    contact.process();
                    break;
                case 12:
                    Frequency frequency = new Frequency();
                    frequency.read();
                    break;
                case 13:
                    Tictactoc tictactoc = new Tictactoc();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}