package org.example;

import org.example.Package.bankaccount.BankAccount;
import org.example.Package.calculator.Calculator;
import org.example.Package.connectionpool.ConnectionPool;
import org.example.Package.contacts.Contacts;
import org.example.Package.creditcard.CreditCard;
import org.example.Package.frequency.Frequency;
import org.example.Package.list.LinkedList;
import org.example.Package.list.QueueList;
import org.example.Package.point.BasicPoint;
import org.example.Package.sets.Sets;
import org.example.Package.shape.Shape;
import org.example.Package.student.Student;
import org.example.Package.studentdetails.StudentDetails;
import org.example.Package.tictactoc.Tictactoc;

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