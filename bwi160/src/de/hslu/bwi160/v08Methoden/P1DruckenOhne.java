package de.hslu.bwi160.v08Methoden;

import java.util.*;

/**
 * @author Klaus Freyburger
 * Beispiel f�r Spaghetti-Code
 */
public class P1DruckenOhne {
  public static void main(String[] args) {

  System.out.println("Hier drucken wir eine sch�ne Kopfzeile");
// irgendwie auch das Datum (interessiert uns im Moment nicht
  Date dt = new Date();
  System.out.println( "Datum:" + dt );
  System.out.println();

// Dann f�hren wir Berechnungen durch und geben das Ergebnis aus
  int x = 1, y= 2;
  System.out.println("Das Ergebnis betr�gt: "+(x+y));

// Schlie�lich verabschieden wir uns
  System.out.println();
  System.out.println("Tsch��, das war's");
  System.out.println("Bis zum n�chsten Mal");


  }
}