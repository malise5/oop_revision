package com.systech.interfacess;

import java.util.ArrayList;
import java.util.List;

import com.systech.inheritance.Aeroplane;
import com.systech.inheritance.Cars;
import com.systech.inheritance.FormOfTransportation;

public class MainInt {
  public static void main(String[] args) {
    System.out.println("======interfaces Polymophism=====");
    List<FormOfTransportation> transport = new ArrayList<>();
    transport.add(new Cars());
    transport.add(new Aeroplane());

    for (FormOfTransportation moves : transport) {
      moves.transportGoods();
    }

  }
}
