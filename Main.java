package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//    Uncomment below to use Array method and comment LinkedList method
//        StudentHelper studentHelper = new StudentHelper();
//        Student[] array = studentHelper.createArrayOfStudents(2);
//        studentHelper.printArrayOfStudents(array);

//    Uncomment below to use LinkedList method and comment Array method
        StudentHelperList studentHelperList = new StudentHelperList();
        LinkedList<Student> list = studentHelperList.createListOfStudents(2);
        studentHelperList.printListOfStudents(list);
    }
}
