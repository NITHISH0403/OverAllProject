package org.example.Package;

import java.util.logging.Logger;

class Circle
{
    int r;
    Logger l = Logger.getLogger("com.api.jar");
    Circle(int radius)
    {
        r = radius;
        l.info("Circle is Created...");
    }
    int perimeter()
    {
        return r;
    }
    double area()
    {
        return 3.14*r*r;
    }
}