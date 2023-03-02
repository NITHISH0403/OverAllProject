package org.example.Package;

import java.util.logging.*;

public class  Student
{
        Logger l = Logger.getLogger("com.api.jar");

        public void update() {
            Process p = new Process();
            p.updategrade();
            p.update();

            //use in Lambda method
            l.log(Level.INFO, p::display);
        }
}
