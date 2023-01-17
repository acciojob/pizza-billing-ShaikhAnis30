package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = 300;
        this.bill = "";
    }


    public int getPrice(){
        if(isVeg) {
            return this.price;
        }else {
            return this.price + 100;
        }
    }

    public void addExtraCheese(){
        // your code goes here
        price += 80;
        System.out.println("Extra Cheese Added: " + 80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg == true) {
            System.out.println("Extra Toppings Added: " + 70);
            price += 70;
        }else {
            System.out.println("Extra Toppings Added: " + 120);
            price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: " + 20);
        price += 20;
    }

    public String generateBill(){
        String billForPizza = String.valueOf(getPrice());
        setBill(billForPizza);
        return billForPizza;
    }

    public String getBill(){
        // your code goes here
        bill = generateBill();
        return this.bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
}
