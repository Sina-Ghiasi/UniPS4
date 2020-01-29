package com.company;

public class ShortTermAccount extends Account {
    private int profit =5;
    @Override
    public void makeProfit() {
        int s =getAmount();
        setAmount(s+s*profit/100);
    }
}
