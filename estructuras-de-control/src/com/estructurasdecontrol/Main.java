package com.estructurasdecontrol;

public class Main {
  public static void main(String[] args) {
    String[] names = {"José", "Juan", "Pedro"};
    String text = "";

    for (String name : names) {
      text += name + " ";
    }

    System.out.println(text);
  }
}