package com.campus.model;
import com.campus.contract.StudentOperations;
public class Student implements StudentOperations {
    //encapsulation
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;


    //static variable to keep track of the number of students
    
    static int studentCount = 0;
    //default constructor
    public Student() {
        studentCount++;

        //parameterized constructor
        public Student(int studentid, String studentname, int age, String department, int[] marks) {
            this.studentid = studentid;
            this.studentname = studentname;
            this.age = age;
            this.department = department;
            this.marks = marks;
            studentCount++;
        }
        //getter and setter methods
        public int getStudentid() {
            return studentid;

        }
       
        public String getStudentname() {
            return studentname;
        }
        
        public int getAge() {
            return age;
        }
        
        public String getDepartment() {
            return department;
        }
        public int[] getMarks() {
            return marks;
        }
        //setter methods
        public void setStudentid(int studentid) {
            this.studentid = studentid;
            
        }
        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public void setMarks(int[] marks) {
            this.marks = marks;
        }

        \\method to calculate the average marks of the student
        public void displayStudentDetails() {
            System.out.println("Student ID: " + studentid);
            System.out.println("Student Name: " + studentname);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);


        public void displayStudentInfo(boolean showMarks) {
          displayStudentInfo();
            if (showMarks) {
                System.out.print("Marks: "+ java.util.Arrays.toString(marks));
            }
                
            
            }

        }

}   }