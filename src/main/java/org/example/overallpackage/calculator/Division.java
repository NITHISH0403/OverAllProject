package org.example.overallpackage.calculator;

class Division extends Calculation {
    Division(double r, double y) {
        super(r, y);
    }

    String calc(){
        result = result / n2;
        return String.valueOf(result);
    }
}
