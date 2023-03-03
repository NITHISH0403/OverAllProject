package org.example.overallpackage.point;

import java.util.logging.*;
public class BasicPoint {

        Logger l = Logger.getLogger("com.api.jar");

        public void process() {
            Point o1 = new Point();

           
            //clone o1.
            Point o2 = (Point) o1.clonepoint();

            l.info(o1.x1 + " " + o1.y1);
            if (o1.x1.equals(o2.x2) && o1.y1.equals(o2.y2)) {
                l.info("Your Co-ordinates is True.");
                l.info("x1:" + o1.x1 + " " + "y1:" + o1.y1);
                l.info("x2:" + o1.x2 + " " + "y2:" + o1.y2);
            } else {
                l.info("Your Co-ordinates is False.");
                l.info("x1:" + o1.x1 + " " + "y1:" + o1.y1);
                l.info("x2:" + o1.x2 + " " + "y2:" + o1.y2);
            }
        }
}
