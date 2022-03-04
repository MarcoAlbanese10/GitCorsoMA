/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istruzione;

/**
 *
 * @author marco.albanese
 */
public class Docente {
    private String Nome;
    private String Cognome;
    private int codice;
    private int età;
        
    public Docente(String n, String c, int cod, int e){
        Nome = n; Cognome =c; codice = cod; età = e;
    }
    public Docente(Docente d){
        Nome=d.getNome();
        Cognome=d.getCognome();
        codice=d.getCodice();
        età=d.getEtà();
        }
    public String getNome(){
        return Nome;
    }
    public String getCognome(){
        return Cognome;
    }
    public int getCodice(){
        return codice;
    }
    public int getEtà(){
        return età;
    }

  
    

    
        
    
}
 
    


    
    
    

