package de.hslu.bwi160.v05Verzweigung;


public class P3Verzweigung {
  public static void main(String[] args) {

    int a=10;

    System.out.println("a = "+a);
    if (a > 0)
      System.out.println("a ist gr��er als Null");

    // Leere Anweisung
    a = -10;
    System.out.println("a = "+a);
    if (a > 0);
      System.out.println("a ist gr��er als Null");
    
    
    a = 10;
    System.out.println("a = "+a);
    if (a > 0)
      if (a > 5) System.out.println("a ist sehr gro�");
    else System.out.println("a ist kleiner als Null");

// falsch:
    a=-10;
    System.out.println("a = "+a);
    if (a > 0)
      if (a > 5) System.out.println("a ist sehr gro�");
    else System.out.println("a ist kleiner als Null");

// korrekt:
    a=-10;
    System.out.println("a = "+a);
    if (a > 0) {
      if (a > 5) System.out.println("a ist sehr gro�");
    }
    else System.out.println("a ist kleiner als Null");

// auch korrekt:
    a=3;
    System.out.println("a = "+a);
    if (a > 0)
      if (a > 5) System.out.println("a ist sehr gro�");
      else System.out.println("a ist g�sser Null und kleiner als 5");
// aber besser eine zus�tzliche Klammer spendieren
    a=3;
    System.out.println("a = "+a);
    if (a > 0) {
      if (a > 5) System.out.println("a ist sehr gro�");
      else System.out.println("a ist g�sser Null und kleiner als 5");
    }
 
    
  }
}