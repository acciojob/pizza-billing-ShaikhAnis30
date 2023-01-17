package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);  // 450
    System.out.println(dp.getPrice());  // 450
    dp.addTakeaway();  // 20
    dp.addExtraCheese();  // 80
    dp.addTakeaway();  // 20
    String billForDeluxePizza = String.valueOf(dp.getPrice());
    dp.setBill(billForDeluxePizza);
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);  // 300
    p.addExtraCheese();  // 80
    p.addExtraToppings();  // 70
    p.addTakeaway();  // 20
    String billForPizza = String.valueOf(p.getPrice());
    p.setBill(billForPizza);
    System.out.println(p.getBill());
  }
}