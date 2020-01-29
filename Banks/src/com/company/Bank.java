package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private String BankName;
    public static ArrayList<Account> accountlist =new ArrayList<Account>();
    Scanner in =new Scanner(System.in);
    private int a;
    private String b;

    /*public Bank(String bankName) {
        BankName = bankName;
    }*/

    public void makeAccount (){
        System.out.println("Choose your account type :\n1-LongTerm 2-ShortTerm 3-GoodLend ");
        switch (Integer.parseInt(in.nextLine())){
            case 1:
                accountlist.add(new LongTermAccount());
                break;
            case 2:
                accountlist.add(new ShortTermAccount());
                break;
            case 3:
                accountlist.add(new GoodLend());
                break;
        }
    }
}
