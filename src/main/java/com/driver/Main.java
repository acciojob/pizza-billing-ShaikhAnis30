package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);  // 300
    System.out.println(dp.getPrice());  // 300
    dp.addTakeaway();  // 20
    dp.addExtraCheese();  // 80
    dp.addTakeaway();  // 20
    System.out.println(dp.getBill());


    Pizza p = new Pizza(false);  // 300
    p.addExtraCheese();  // 80
    p.addExtraToppings();  // 70
//    p.addTakeaway();  // 20
    System.out.println(p.getBill());
  }
}