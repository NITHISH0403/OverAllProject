package org.example.Package;

abstract class Calculation{
    double result;
    double n2;
    Calculation(double r, double y){
        result = r;
        n2 = y;
    }
    abstract String calc();
}