/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 14.09.2017
  * @author Jörn Ulfert
  */


    public class Methoden_Arrays_01_M {

    public static double einzahlen(double k_stand) {
    double betrag = 0;
    System.out.println();
    System.out.println("  Gewünschter Einzahlungsbetrag: ");
    System.out.print("[Einzahlungsbetrag in Euro]> ");
    betrag = Tastatur.liesDouble();
    if (betrag > 0) {
      k_stand = k_stand + betrag;
    } else {
      System.out.println("[!]> Sie können keine negativen Werte einzahlen!");
    }// end of if
    
    ausgabe(k_stand);
    return k_stand;
  }
  public static double auszahlen(double k_stand) {
    double betrag = 0;
    System.out.println();
    System.out.println(" AUSZAHLEN");
    System.out.print("[Auszahlungsbetrag in Euro]> ");
    betrag = Tastatur.liesDouble();
    if (k_stand - betrag > 0) {
      k_stand = k_stand - betrag;
    } else {
      System.out.println("[!]> Sie haben nicht ausreichend Guthaben auf ihrem Konto!");
    } // end of if
    
    ausgabe(k_stand);
    return k_stand;
  }
  public static double verzinsen(double k_stand, double zins) {
    double zwisch = 0;
    System.out.println();
    System.out.println("Ihr Konto wird verzinst");
    zwisch = k_stand * zins;
    k_stand = k_stand + zwisch;
    ausgabe(k_stand);
    return k_stand;
  }
  
  public static void ausgabe(double k_stand) {
  k_stand = Math.round(100.0 * k_stand) / 100.0;   // Kontostand auf 2 Nachkommastellen runden.
    System.out.println(" Ihr akuteller Kontostand lautet: " + k_stand + " Euro");
    
  }
  
  public static double zins() {
    double satz = 0;
    double betrag = 0;
    System.out.println(" Ihren Zinssatz festlegen");
    System.out.print("[Zinssatz in %]> ");
    betrag = Tastatur.liesDouble();
    if (betrag > 0) {
      satz = betrag / 100;
      
    } else {
      System.out.println("[!]> Der Zinssatz muss positiv sein!");
    } // end of if
    
    return satz;
  
  } // end of main

} // end of class Methoden_Arrays_01_M
