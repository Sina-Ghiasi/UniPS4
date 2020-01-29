package com.company;

public class GoodLend extends Account {
    private int profit =0;
    @Override
    public void makeProfit() {
        int s =getAmount();
        setAmount(s+s*profit/100);
    }
}
