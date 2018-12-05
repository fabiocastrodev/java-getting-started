package com.example;

public class Bhaskara {
  double a;
  double b;
  double c;
  
  public Bhaskara(double a, double b) {
    this.a = a;
    this.b = b;
    this.c = 0;
  }
  
  public Bhaskara(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
                  
  public double getA() {
    return this.a;
  }
  
  public double getB() {
    return this.b;
  }
  
  public double getC() {
    return this.c;
  }
                  
  public double getDelta() {
    return (getB() * getB()) - (4 * getA() * getC());
  }
                  
  public double getX1() {
    return (-getB() + getDelta()) / (getA() * 2);
  }
                  
  public double getX2() {
    return (-getB() - getDelta()) / (getA() * 2);
  }                
}