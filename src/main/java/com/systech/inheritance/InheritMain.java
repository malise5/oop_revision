package com.systech.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritMain {
  public static void main(String[] args) {
    System.out.println("Inheritance Poly");
    List<FormOfTransportation> list = new ArrayList<>();
    list.add(new Aeroplane());
    list.add(new Cars());

    for (FormOfTransportation trans : list) {
      trans.transportGoods();
    }
  }
}
