package com.systech.interfacess;

public class Car implements EngineAndTransportsI, NoEngineAndTransportsI {

  @Override
  public void hasEngine() {
    System.out.println("A car has an Engine");
  }

  @Override
  public void transportsGoods() {
    System.out.println("A Car can Transport Goods");
  }

}
