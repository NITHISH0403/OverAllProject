package org.example.Package.Shape;

import java.util.logging.*;

class Rectangle
{
    int b;
    int l;
    Logger l1 = Logger.getLogger("com.api.jar");
    Rectangle(int width, int length)
    {
        b = width;
        l = length;
        l1.info("Rectangle is Created...");
    }
    int perimeter()
    {
        return 2*(l+b);
    }
    int area()
    {
        return l*b;
    }
}