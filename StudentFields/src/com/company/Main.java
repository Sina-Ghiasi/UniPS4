package com.company;

import com.company.exp.StudentException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student();
        try {
            s1.check();
        } catch (StudentException e) {
            e.printStackTrace();
        }

    }
}
