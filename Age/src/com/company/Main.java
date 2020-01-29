package com.company;

import com.company.exp.SomeHumanException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        SomeHuman a =new SomeHuman();
        try {
            a.getage();
        } catch (SomeHumanException e) {
            e.printStackTrace();
        }
        try {
            a.nationality();
        } catch (SomeHumanException e) {
            e.printStackTrace();
        }
        try {
            a.educationDegree();
        } catch (SomeHumanException e) {
            e.printStackTrace();
        }


    }
}
