package de.hslu.bwi160.v04aAnweisungenTeil1;
public class P2UmrechnungCentInEuro {

	public static void main(String[] args) {
		int cent = 234;

		int euro, restlicheCent;
		euro = cent / 100;
		restlicheCent = cent % 100;

		
//  print schreibt in eine Zeile
		System.out.print(cent);
//  Zeichenkette als Konstante ist vom Typ String in "
		System.out.print(" Cent sind ");
		System.out.print(euro);
		System.out.print(" Euro und ");
		System.out.print(restlicheCent);
//  println schlie�t zus�tzlich die Zeile ab
		System.out.println(" Cent");
		
	}

}
