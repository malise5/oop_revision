package com.systech.abstarct;

import java.util.ArrayList;
import java.util.List;

public class AbsMain {
  public static void main(String[] args) {
    System.out.println("======= Abstarct Method ==================");
    List<Trans> list = new ArrayList<>();

    list.add(new Donkey());
    list.add(new Gari());

    for (Trans trans : list) {
      trans.hasEngine();
    }
  }
}
