package org.example.Package.Studentdetails;

import java.util.*;
import java.util.logging.*;

public class StudentDetails {
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        ArrayList<StudentTest> list = new ArrayList<>();

        int n;
        String name;
        int age;
        double gpa;
        public StudentDetails() {
            l.info("Enter the Number of Student Details :");
            n = a1.nextInt();
            for (int i = 0; i < n; i++) {
                l.info("Enter the Student Name:");
                name = a2.nextLine();

                l.info("Enter the Student Age:");
                age = a1.nextInt();

                l.info("Enter the Student GPA:");
                gpa = a1.nextDouble();

                StudentTest s1 = new StudentTest(name, age, gpa);
                s1.setDetails(name, age, gpa);
                l.log(Level.INFO, () -> s1.getName());
                l.log(Level.INFO, () -> String.valueOf(s1.getAge()));
                l.log(Level.INFO, () -> String.valueOf(s1.getGpa()));

                list.add(s1);
            }
        }

        public void test(){
            Iterator<StudentTest> i = list.iterator();
            //traversing elements of ArrayList object
            while (i.hasNext()) {
                StudentTest st = i.next();
                l.log(Level.INFO,() -> st.sname + " " + st.sage + " " + st.sgpa);
            }

            list.sort(new Sort());
            Iterator<StudentTest> i1 = list.iterator();
            while(i1.hasNext()){
                StudentTest st = i1.next();
                l.log(Level.INFO,() -> st.sname + " " + st.sage + " " + st.sgpa);
            }
        }
}