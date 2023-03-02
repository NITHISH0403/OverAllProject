package org.example.Package;

import java.util.logging.*;

public class  CreditCard
{
        Logger l = Logger.getLogger("com.api.jar");

        public void credit() {
            Card o1 = new Card();
            //call object clone().
            //clone o1.
            Card o2 = (Card) o1.clone();

            l.log(Level.INFO, () -> "Holder Name:" + o1.hname + " " + "Card No:" + o1.cno + " " + "Valid To:" + o1.vto);
            if (o1.hname.equals(o2.holderName) && o1.cno.equals(o2.cardNo) && o1.vto.equals(o2.validTo)) {
                l.info("Your Co-ordinates is True.");
                l.log(Level.INFO, () -> "Holder Name:" + o1.hname + " " + " Card NO: " + "y1:" + o1.cno);
                l.log(Level.INFO, () -> "Holder Name:" + o1.holderName + " " + " Card NO: " + o1.cardNo);
            } else {
                l.info("Your Co-ordinates is False.");
                l.log(Level.INFO, () -> "Holder Name:" + o1.holderName + " " + " Card NO: " + o1.cardNo);
                l.log(Level.INFO, () -> "Holder Name:" + o1.hname + " " + " Card NO: " + o1.cno);
            }
        }
}