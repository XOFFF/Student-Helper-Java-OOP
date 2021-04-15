package com.company;

import java.util.Scanner;

public class Student extends Person {
    Scanner scan = new Scanner(System.in);

    private String university;
    private String subject;
    private String av_grade;

    public void getStudentData(){
        getPersonData();
        System.out.println("Please, write your student data:");
        university = scan.nextLine();
        subject = scan.nextLine();
        av_grade = scan.nextLine();
    }

    public void printStudentData(){
        System.out.println("-------------------");
        printPersonData();
        System.out.println(university);
        System.out.println(subject);
        System.out.println(av_grade);
    }
}
