package org.example.Package;


import java.util.logging.Level;
import java.util.logging.Logger;

class Payment
{
    static Logger l=Logger.getLogger("My Logger");

    //constructor
    Payment (String name, int no)
    {
        l.log (Level.INFO,()->"Hii\t" + name + "\tyour account will be created.");
        l.log (Level.INFO,()->"Your account No is\t" + no);
    }

    //method that allows the user to make a deposit to the account.
    double deposit (double d, double balance)
    {
        balance = balance + d;
        return balance;
    }

    //method that allows the user to make a Withdrawal to the account.
    double withdraw (double w, double balance)
    {
        balance = balance - w;
        return balance;
    }

    //method that returns the current balance of the account.
    void amount (double balance)
    {
        l.log (Level.INFO,()->"Your Current Balance :" + balance);
    }

}