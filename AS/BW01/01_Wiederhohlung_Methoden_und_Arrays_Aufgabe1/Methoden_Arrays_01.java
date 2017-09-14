/**
  *
  * Aufgabe 1 vom AB Wiederholung Methoden und Arrays
  *
  * @version 1.0 vom 14.09.2017
  * @author Jörn Ulfert
  * @klasse FS63
  */

public class Methoden_Arrays_01 {
  
  public static void main(String[] args) {
    int wahl = 0;
    double z_satz = 0;
    double k_stand = 0;
    do {
      System.out.println();
      System.out.println();
      System.out.println("---------------------------------------------");
      System.out.println("->(1) Einzahlen");
      System.out.println("->(2) Auszahlen");
      System.out.println("->(3) Verzinsen");
      System.out.println("->(4) Zinssatz festlegen");
      System.out.println("->(5) Kontostand");
      System.out.println("->(6) Beenden");
      System.out.println("---------------------------------------------");
      System.out.print("[Bitte wählen Sie einen Menüpunkt (1-5)]> ");
      wahl = Tastatur.liesInt();
      
     
      switch(wahl) {
        case 1:
          k_stand = Methoden_Arrays_01_M.einzahlen(k_stand);
          break; 
        case 2:
          k_stand = Methoden_Arrays_01_M.auszahlen(k_stand);
          break;    
        case 3:
          k_stand = Methoden_Arrays_01_M.verzinsen(k_stand, z_satz);
          break;  
        case 4:
          z_satz = Methoden_Arrays_01_M.zins();
          break;   
        case 5:
          Methoden_Arrays_01_M.ausgabe(k_stand);
          break;          
      }
    } while (wahl!=6); // end of do-while
    
    
  } // end of main


} // end of class Methoden_Arrays_01