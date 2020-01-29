package com.company;

import com.company.exp.BankException;

import java.util.Scanner;

public class Main {

    public static Account Find(String token){
    Account temp = null;
    for(Account t : Bank.accountlist)
        if(t.getName().equals(token))
            temp = t;
        return  temp;
}
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Hi !)");
        boolean f =true;
        do {
            System.out.println("Choose what to do :\n1-Make account 2-Operation on accounts 3-See your accounts 4-Exit");
            switch (Integer.parseInt(in.nextLine())){
                case 1:
                    Bank melli = new Bank();
                    melli.makeAccount();
                    System.out.println("\f");
                    break;
                case 2:
                    System.out.println("Enter your name : ");
                    String name = in.nextLine();
                    Account temp = null;
                    boolean f2 = true;
                    temp = Find(name);
                            if(temp !=null)
                            {
                                while(f2){
                                    System.out.println("Choose 1-Withdrawal 2-Deposit 3-Profit 4-Back");
                                    switch (Integer.parseInt(in.nextLine())){
                                        case 1:
                                            try{
                                                temp.withdrawl();
                                                System.out.println("Your amount : "+ temp.getAmount());
                                            }catch(BankException e){
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 2:
                                            try{
                                                temp.deposit();
                                                System.out.println("Your amount : "+ temp.getAmount());
                                            }catch(BankException e){
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 3:
                                            temp.makeProfit();
                                            System.out.println("Your amount : "+ temp.getAmount());
                                            break;
                                        case 4:
                                            f2 =false;
                                            break;

                                    }
                                }
                                Bank.accountlist.remove(Find(name));
                                Bank.accountlist.add(temp);
                            }
                            else
                            {
                                System.out.println("not found");
                            }
                                break;
                case 3:
                    for (int i = 0; i < 20; ++i) System.out.println();
                    Bank.accountlist.forEach(Account ->{ System.out.println("Account model : "+Account.AccountModel+" Name : " + Account.getName() + ", Ammount : " + Account.getAmount()); });
                    break;
                case 4:
                    f =false;
                    break;
                default:
                    System.out.println("Choose one of the list above ");
            }

        }while(f);

    }
}
