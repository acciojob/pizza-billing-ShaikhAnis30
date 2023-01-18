package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAway;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        isCheeseAdded = false;
        isToppingAdded = false;
        isBillGenerated = false;
        isTakeAway = false;

        extraCheesePrice = 80;
        takeAwayPrice = 20;
        if(isVeg) {
            price = 300;
            extraToppingPrice = 70;
        }else{
            price = 400;
            extraToppingPrice = 120;
        }

        bill = "Base Price Of The Pizza: " + price + "\n";
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            price += extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded) {
            price += extraToppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            price += takeAwayPrice;
            isTakeAway = true;
        }
    }

    public String getBill() {
        if(!isBillGenerated) {
            isBillGenerated = true;

            if(isCheeseAdded) {
                bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            }

            if(isToppingAdded) {
                bill += "Extra Toppings Added: " +  extraToppingPrice + "\n";
            }

            if(isTakeAway) {
                bill += "Paperbag Added: " + takeAwayPrice + "\n";
            }

            bill += "Total Price: " + price + "\n";
        }
        return this.bill = bill;
    }
}
