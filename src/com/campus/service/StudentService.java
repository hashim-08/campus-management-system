package com.campus.service;
import com.campus.model.Student;
public class StudentService {
    //calculate total marks of a student
    public int calculateTotal(Student student) {
        if (student.getMarks() == null) {
            return 0;
        }
        int total = 0;
        int[] marks = student.getMarks();
        for (int mark : marks) {
        
            total += mark;
        }
        return total;   
        ///calculate average marks of a student

        public double calculateAverage(Student student) {
            if (student.getMarks() == null || student.getMarks().length == 0) {
                return 0.0;
            }
            int total = calculateTotal(student);
            return (double) total / student.getMarks().length;
        }
        //find maximum marks of a student
        public int findMaximum(Student student) {
            if (student.getMarks() == null || student.getMarks().length == 0) {
                return 0;
            }
            int max = student.getMarks()[0];
            int[] marks = student.getMarks();
            for (int mark : marks) {
                if (mark > max) {
                    max = mark;
                }
            }
            return max;
        }
        //find minimum marks of a student
        public int findMinimum(Student student) {
           int[] marks = student.getMarks();
            if (marks == null || marks.length == 0) {
                return 0;
            }
            int min = marks[0];
            for (int mark : marks) {
                if (mark < min) {
                    min = mark;
                }
            }
            return min;
            
            //grade of a student based on average marks
            public char grade(Student student) {
              int[] marks = student.getMarks();
                if (marks == null || marks.length == 0) {
                    return 'F';
                }
                int total = calculateTotal(student);
                int average = (int) calculateAverage(student);
                if (average >= 90) {
                    return 'A';
                } else if (average >= 80) {
                    return 'B';
                } else if (average >= 70) {
                    return 'C';
                } else if (average >= 60) {
                    return 'D';
                } else {
                    return 'F';

                
            }
            //pass or fail status of a student based on average marks
            public String passOrFail(Student student) {
                if (student.getMarks() == null || student.getMarks().length == 0) {
                    return "Fail";
                }
                double average = calculateAverage(student);
                return average >= 40 ? "Pass" : "Fail";
            }
            //pass or fail using marks array
            public String passOrFailUsingMarks(Student student) {
                int[] marks = student.getMarks();
                if (marks == null || marks.length == 0) {
                    return "Fail";
                }
                for (int mark : marks) {
                    if (mark < 40) {
                        return "Fail";
                    }
                }
                return "Pass";
                else{
                    return "Fail";
                    
                }
            }
            //display report card of a student
            public String displayReportCard(Student student) {
            
                System.out.println("Report Card for " + student.getName());
                System.out.println("Total Marks: " + calculateTotal(student));
                System.out.println("Average Marks: " + calculateAverage(student));
                System.out.println("Maximum Marks: " + findMaximum(student));
                System.out.println("Minimum Marks: " + findMinimum(student));
                System.out.println("Grade: " + grade(student));
                System.out.println("Pass/Fail Status: " + passOrFail(student));
                return "Report Card displayed successfully.";
            }
        }
    }
}
}
