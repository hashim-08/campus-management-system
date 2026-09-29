package com.campus.services;
import java.util.List;
import java.util.ArrayList;


public class StudentService {
    private static List<String> students = new ArrayList<>();
    //get all students
    public StudentService() {
        students.add("101 - bill - java");
        students.add("102 - jane - mathematics");
        students.add("103 - alice - physics");
    }
    public List<String> getStudents() {
        return students;
        }
    
    //add a new student
    public void addStudent(String name, String Course) {
        students.add(String.valueOf(students.size() + 101)+" - " + name + " - " + Course);

}
}