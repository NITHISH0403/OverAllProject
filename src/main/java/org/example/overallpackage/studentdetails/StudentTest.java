package org.example.overallpackage.studentdetails;

class StudentTest{
    String sname;
    int sage;
    double sgpa;

    StudentTest(String n, int a, double g) {
        setDetails(n,a,g);
    }
    void setDetails(String n, int a, double g){
        sname = n;
        sage = a;
        sgpa = g;
    }
    String getName(){
        return sname;
    }
    int getAge(){
        return sage;
    }
    Double getGpa(){
        return sgpa;
    }
}
