package org.example.Package.Calculator;
class Multiplication extends Calculation {
    Multiplication(double r, double y) {
        super(r, y);
    }
    String calc(){
        result = result * n2;
        return String.valueOf(result);
    }
}