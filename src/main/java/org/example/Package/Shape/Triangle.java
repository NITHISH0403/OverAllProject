package org.example.Package.Shape;

import java.util.logging.Logger;

class Triangle
{
    int b;
    int h;
    int a;
    int c;
    Logger l = Logger.getLogger("com.api.jar");
    Triangle(int base, int height, int side1, int side2)
    {
        b = base;
        h = height;
        a = side1;
        c = side2;
        l.info("Triangle is Created...");
    }
    //method that calculates and returns the perimeter of the shape.
    int perimeter()
    {
        return a+b+c;
    }
    //method that calculates and returns the area of the shape.
    int area()
    {
        return h*b/2;
    }
}