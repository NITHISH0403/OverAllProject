package org.example.overallpackage.calculator;


class Addition extends Calculation {
    Addition(double r, double y) {
        super(r, y);
    }
    String calc(){
        result = result + n2;
        return String.valueOf(result);
    }
}