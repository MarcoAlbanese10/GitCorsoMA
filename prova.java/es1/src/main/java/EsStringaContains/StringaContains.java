/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EsStringaContains;

import com.mycompany.es1.ClassRettan;

/**
 *
 * @author marco.albanese
 */
//verificare che una stringa contiene un'altra stringa 

public class StringaContains {
     public static void main(String[] args) {
        String str = "Casale";
        String subStr = "Casa";
        boolean containsStr = str.contains(subStr);
        System.out.println(containsStr);
        
    // controllo che ignora maiuscole e minuscole
        subStr = "Ale";
        containsStr = str.toLowerCase().contains(subStr.toLowerCase());
        System.out.println(containsStr);
//scrivere un programma che data una stringa interamente in minuscolo(es.ciao)
//stampi la stringa stessa con le posizioni dispari in maiuscolo(es.CiAo)
     
     
   String y = "ciao";
    String x = "";
     for(int w=0; w<y.length(); w++) {
        if(w%2==0){
            x+=Character.toUpperCase(y.charAt(w));
        }
        else{
            x+=(y.charAt(w));
        }
    }
      System.out.println(x);  
    }
     
    
}
     

        









