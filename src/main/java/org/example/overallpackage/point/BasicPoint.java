package org.example.overallpackage.point;

import java.util.logging.*;
public class BasicPoint {

        Logger l = Logger.getLogger("com.api.jar");

        public void process() {
            Point o1 = new Point();

           
            //clone o1.
            Point o2 = (Point) o1.clonepoint();

            l.log(Level.INFO,()->o1.x1 + " " + o1.y1);
            if (o1.x1.equals(o2.x2) && o1.y1.equals(o2.y2)) {
                l.log(Level.INFO,()->"Your Co-ordinates is True.");
                l.log(Level.INFO,()->"x1:" + o1.x1 + " " + "y1:" + o1.y1);
                l.log(Level.INFO,()->"x2:" + o1.x2 + " " + "y2:" + o1.y2);
            } else {
                l.log(Level.INFO,()->"Your Co-ordinates is False.");
                l.log(Level.INFO,()->"x1:" + o1.x1 + " " + "y1:" + o1.y1);
                l.log(Level.INFO,()->"x2:" + o1.x2 + " " + "y2:" + o1.y2);
            }
        }
}
