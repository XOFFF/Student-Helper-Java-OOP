package com.company;

import java.util.Scanner;

public class Address {
    Scanner scan = new Scanner(System.in);

    private String street;
    private String postCode;
    private String flatNum;
    private String houseNum;
    private String city;
    private String country;

    public void getAddressData() {
        System.out.println("Please, write your address:");
        street = scan.nextLine();
        postCode = scan.nextLine();
        flatNum = scan.nextLine();
        houseNum = scan.nextLine();
        city = scan.nextLine();
        country = scan.nextLine();
    }

    public void printAddressData(){
        System.out.println(street);
        System.out.println(postCode);
        System.out.println(flatNum);
        System.out.println(houseNum);
        System.out.println(city);
        System.out.println(country);
    }
}
