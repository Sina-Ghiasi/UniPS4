package com.company;

import com.company.exp.BankException;

import java.util.Scanner;

public abstract class Account {
    Scanner in =new Scanner(System.in);
    //private String BankName;
    private String name;
    private int amount;
    protected String AccountModel;
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    /*public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }*/

    public Account() {
        System.out.println("Enter your name :");
        this.name = in.nextLine();
        System.out.println("Enter the amount :");
        this.amount = Integer.parseInt(in.nextLine());
    }
    public abstract void makeProfit();
    public void deposit() throws BankException {
        System.out.println("Enter amount money you want to dopsit : ");
        int a = Integer.parseInt(in.nextLine());
        if (a<0 & a>30000000){
            throw new BankException("Invalid amount !");
        }
        else {
            amount = amount + a;
        }
    }
    public void withdrawl() throws  BankException{
        System.out.println("Enter amount money you want to withdrawl : ");
        int b = Integer.parseInt(in.nextLine());
        if(b<0 & b>3000000 & b>amount){
            throw new BankException("Invalid amount !");
        }
        else{
            amount = amount - b;
        }
    }
}
