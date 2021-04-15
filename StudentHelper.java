package com.company;

public class StudentHelper {

    public Student[] createArrayOfStudents (int counter){
        Student[] studentArray = new Student[counter];

        for(int i = 0; i < studentArray.length; i++){
            Student student = new Student();
            student.getStudentData();
            studentArray[i] = student;
        }
        return studentArray;
    }

    public void printArrayOfStudents(Student[] array){
        for(Student st : array){
            st.printStudentData();
        }
    }

}
