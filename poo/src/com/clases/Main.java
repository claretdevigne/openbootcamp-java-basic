package com.clases;

import com.clases.smatdevice.SmartDevice;
import com.clases.smatdevice.SmartPhone;
import com.clases.smatdevice.SmartWatch;

public class Main {
  public static void main(String[] args) {
    SmartPhone iPhone = new SmartPhone("Apple", "iPhone 14", 2022, true, true, 7, true, false);
    SmartWatch iWatch = new SmartWatch("Apple", "iWatch 7", 2021, true, true, 2, true, false);

    System.out.println("----- iPhone 14 -----");
    System.out.println("Marca: " + iPhone.marca);
    System.out.println("Modelo: " + iPhone.modelo);
    System.out.println("Año: " + iPhone.anyo);
    System.out.println("Pantalla: " + iPhone.screenSize + " pulgadas.");

    System.out.println("");

    System.out.println("----- iWatch 7 -----");
    System.out.println("Marca: " + iWatch.marca);
    System.out.println("Modelo: " + iWatch.modelo);
    System.out.println("Año: " + iWatch.anyo);
    System.out.println("Pantalla: " + iWatch.screenSize + " pulgadas.");
  }
}
