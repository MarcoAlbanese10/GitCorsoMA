/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbisestile;

/**
 *
 * @author marco.albanese
 */
public class bisestile {
     public static void main(String[] args) {
         
	  System.out.print("Inserisci l'anno: ");    
     int anno = 2022;
            
    // Calcolo se anno è bisestile.
    boolean divisibilePer4   = (anno % 4 == 0);
    boolean divisibilePer100 = (anno % 100 != 0);
    boolean divisibilePer400 = (anno % 400 == 0);
    boolean bisestile        = divisibilePer4 && (divisibilePer100 || divisibilePer400);
    if (bisestile)
      System.out.println("L'anno " + anno + " e' bisestile");
    else
      System.out.println("L'anno " + anno + " NON e' bisestile");
  }
    
}
