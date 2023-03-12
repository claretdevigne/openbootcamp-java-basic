package com.clases.smatdevice;

public abstract class SmartDevice {
  public String marca;
  public String modelo;
  public int anyo;
  public int screenSize;
  public boolean wificonnection;
  public boolean gps;
  public boolean sensores;
  public boolean pantallatactil;

  public void handleWifi() {
    wificonnection = !wificonnection;
  }
}
