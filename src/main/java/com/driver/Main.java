package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);  // 300
    System.out.println("Base Price Of The Pizza: " + dp.getPrice());  // 300
    dp.addTakeaway();  // 20
    dp.addExtraCheese();  // 80
    dp.addTakeaway();  // 20
    System.out.println("Total Price: " + dp.getBill());

    System.out.println();

    Pizza p = new Pizza(true);  // 300
    System.out.println("Base Price Of The Pizza: " + p.getPrice());
    p.addExtraCheese();  // 80
    p.addExtraToppings();  // 70
    p.addTakeaway();  // 20
    System.out.println("Total Price: " + p.getBill());
  }
}