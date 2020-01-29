package com.company;

import com.company.exp.SomeHumanException;

import java.util.Scanner;

public class SomeHuman  {
    Scanner in = new Scanner(System.in);
    public void getage()throws SomeHumanException {
        System.out.println("Enter your age : ");
        int age = Integer.parseInt(in.nextLine());
        if(age<23){
            throw new SomeHumanException("Your age is not enough");
        }
        else {
            System.out.println("Done");
        }

    }
    public void nationality() throws SomeHumanException{
        System.out.println("Enter Your nationality : ");
        String n = in.nextLine();
        if(n.equalsIgnoreCase("iran")){
            System.out.println("Done");
        }
        else{
            throw new SomeHumanException("This program is for irainian");
        }
    }
    public void educationDegree() throws SomeHumanException{
        System.out.println("Enter your degree of education");
        String d = in.nextLine();
        if(d.equalsIgnoreCase("diplom")){
            throw new SomeHumanException("diplom is not enough");
        }
    }
}
