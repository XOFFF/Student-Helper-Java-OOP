package com.company;

import java.util.LinkedList;

public class StudentHelperList {

    public LinkedList<Student> createListOfStudents(int counter) {
        LinkedList<Student> listOfStudents = new LinkedList<>();
        for(int i = 0; i < counter; i++) {
            Student student = new Student();
            student.getStudentData();
            listOfStudents.add(student);
        }
        return listOfStudents;
    }

    public void printListOfStudents(LinkedList<Student> list){
        for(Student st : list ){
            st.printStudentData();
        }
    }


}
