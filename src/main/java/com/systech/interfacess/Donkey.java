package com.systech.interfacess;

public class Donkey implements NoEngineAndTransportsI {

  @Override
  public void transportsGoods() {
    System.out.println("Donkey transports goods");
  }

}
