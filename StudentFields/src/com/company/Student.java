package com.company;

import com.company.exp.StudentException;

import java.util.Scanner;

public class Student {
    //private String name = "sina";
    //private String user = "s79";
    //private String pass = "159";
    Scanner in = new Scanner(System.in);
    public void check() throws StudentException{
        System.out.println("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Enter your user : ");
        String user = in.nextLine();
        System.out.println("Enter your password : ");
        String pass = in.nextLine();
        if(name.equalsIgnoreCase("sina")& user.equalsIgnoreCase("s79")& pass.equalsIgnoreCase("159")){
            System.out.println("Correct");
        }
        else{
            throw new StudentException("Not found or wrong password");
        }
    }
}
