/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collezioni;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marco.albanese
 */
public class Rubrica {
    private List <contatto> contatti;

    public Rubrica() {
        this.contatti = new ArrayList <contatto>();
    }
    void aggiungiContatto (String nome, String cognome, String numeroTelefonico){
        this.contatti.add(new contatto(nome,cognome,numeroTelefonico));
        
    }
    void rimuoviContatto(String nome, String cognome){
        boolean rimosso = false;
        Iterator<contatto> it = this.contatti.iterator();
        while(it.hasNext()&& !rimosso){
            contatto c = it.next();
            if (c.getNome().equals(nome) && c.getCognome().equals(cognome)){
                it.remove();
                rimosso = true;
               
            }
       
        
        }

    }
    String cercaContatto(String nome, String cognome){
        String numeroTelefonico = null;
        Iterator<contatto> it = this.contatti.iterator();
        while(it.hasNext()&& numeroTelefonico == null){
            contatto c = it.next();
            if (c.getNome().equals(nome) && c.getCognome().equals(cognome))
                
                numeroTelefonico = c.getNumeroTelefonico();
            }
                return numeroTelefonico;
                
                
        
    }
    @Override
    public String toString(){
    String s= "Rubrica";
    s+="";
    Iterator<contatto> it=this.contatti.iterator();
    while(it.hasNext()){
    contatto c=it.next();
    s+=c.toString()+"";}
    return s;

          
        
    }
            
}

