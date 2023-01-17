package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        int price = 400;
        if(isVeg) {
            price += 80 + 70;
        }else {
            price += 80 + 120;
        }
    }
}
