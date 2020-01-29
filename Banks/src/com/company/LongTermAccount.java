package com.company;

public class LongTermAccount extends Account {
    private int profit =10;

    @Override
    public void makeProfit() {
        int s =getAmount();
        setAmount(s+s*profit/100);
    }
}
