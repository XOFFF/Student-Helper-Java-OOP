package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        StudentHelper studentHelper = new StudentHelper();
//        Student[] array = studentHelper.createArrayOfStudents(2);
//        studentHelper.printArrayOfStudents(array);

        StudentHelperList studentHelperList = new StudentHelperList();
        LinkedList<Student> list = studentHelperList.createListOfStudents(2);
        studentHelperList.printListOfStudents(list);
    }
}
