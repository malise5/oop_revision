package com.systech.encapsulation;

public class MainEn {
  public static void main(String[] args) {
    System.out.println("======Encapsulation=====");
    Car car1 = new Car(2000, "Nissan");
    Car car2 = new Car(50000, "Mazda");

    System.out.println(car1.getModel());
    System.out.println(car1.getModel());

    System.out.println(car2.getModel());
    System.out.println(car2.getModel());

  }
}
