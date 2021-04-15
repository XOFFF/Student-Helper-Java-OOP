package com.company;

import java.util.Scanner;

public class Person {
    Scanner scan = new Scanner(System.in);

    private String name_person;
    private String surname_person;

    Address address;

    public Person() {
        address = new Address();
    }

    public void getPersonData() {
        address.getAddressData();
        System.out.println("Please, write your person data:");
        name_person = scan.nextLine();
        surname_person = scan.nextLine();
    }

    public void printPersonData(){
        System.out.println(name_person);
        System.out.println(surname_person);
        address.printAddressData();
    }
}
