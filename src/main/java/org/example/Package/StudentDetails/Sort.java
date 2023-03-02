package org.example.Package.StudentDetails;

import java.util.Comparator;

class Sort implements Comparator<StudentTest> {
    public int compare(StudentTest gpa1, StudentTest gpa2){
        return (int)(gpa2.sgpa - gpa1.sgpa);
    }
}