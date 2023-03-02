package org.example.Package.bankaccount;


import java.util.Scanner;
import java.util.logging.*;

public class BankAccount {
    Scanner s = new Scanner(System.in);
    Logger l = Logger.getLogger("com.api.jar");
    String hname ="";
    int ano = 0;
    double balance = 0.0;
    double damt;
    double wamt;
    int ch;
    public BankAccount(){
        try {
            l.info("Welcome User, Create a Your Account");
            l.log(Level.INFO, () -> "Enter the Holder Name:");
            hname = s.nextLine();

            l.log(Level.INFO, () -> "Enter the Account Number:");
            ano = s.nextInt();
        } catch (Exception e) {
            l.log(Level.INFO, () -> "Your input is mismatch");
            System.exit(0);
        }
    }
    public void payment(){
        Payment p = new Payment(hname, ano);
        do{
            l.log(Level.INFO, () -> "select your payment method \n1. Deposit \n2. Withdraw \n3. Balance \n4.Exit");
            ch = s.nextInt();
            switch (ch) {
                case 1 -> {
                    l.info("Your Deposit Amount :");
                    damt = s.nextDouble();
                    balance = p.deposit(damt, balance);
                    l.log(Level.INFO, () -> "Your Balance :" + balance);
                }
                case 2 -> {
                    l.info("Your Withdraw Amount :");
                    wamt = s.nextDouble();
                    if (balance < wamt) {
                        l.log(Level.INFO, () -> "Your Amount balance : " + balance + ". so, didn't withdraw Amount.");
                    } else {
                        balance = p.withdraw(wamt, balance);
                        l.log(Level.INFO, () -> "Your Current Amount :" + balance);
                    }
                }
                case 3 -> p.amount(balance);
                default ->l.info("Your Account is Closed.");
            }
        }while (ch<4);
    }

}
