package com.company;

import com.company.exp.StudenteException;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
    private String name = "sina";
    private String year = "97";
    private String id = "971113045";
    public void check()throws StudenteException {
        System.out.println("Enter your name : ");
       if(name.equalsIgnoreCase(in.nextLine())){
           System.out.println("Year : "+ year);
           System.out.println("ID"+id);
       }
       else{
           throw new StudenteException("Not found !");
       }

    }

}
