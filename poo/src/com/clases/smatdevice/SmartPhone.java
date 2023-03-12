package com.clases.smatdevice;

public class SmartPhone extends SmartDevice {

  public SmartPhone() {

  }

  public SmartPhone(String marca, String modelo, int anyo, boolean gps, boolean pantallatactil, int screenSize, boolean sensores, boolean wificonnection) {
    this.marca = marca;
    this.modelo = modelo;
    this.anyo = anyo;
    this.gps = gps;
    this.pantallatactil = pantallatactil;
    this.screenSize = screenSize;
    this.sensores = sensores;
    this.wificonnection = false;
  }
}
