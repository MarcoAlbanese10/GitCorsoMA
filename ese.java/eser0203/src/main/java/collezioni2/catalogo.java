/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collezioni2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marco.albanese
 */
public class catalogo {
    
public class Catalogo<E extends Articolo> {
    private List<E> catalogo;
    public Catalogo(){
        this.catalogo=new ArrayList<E>();
    }
    void aggiungiArticolo(E art){
        this.catalogo.add(art);
    }

    
       
        
        

    
     List<E> getArticoliSottoPrezzo(double prezzo){    //restituisce una lista degli articoli il cui
        List<E> articoli=new ArrayList<E>();
                                                       //prezzo è minore del valore passato come parametro
        Iterator<E> it = this.catalogo.iterator();
        while(it.hasNext()){
             E ASP = it.next();
            if (ASP.getPrezzo() < prezzo){
                articoli.add(ASP);
            }
        }
        return articoli;
     }        
    @Override
        public String toString(){
        String s="Catalogo articoli";
        s+="";
        Iterator<E> it=this.catalogo.iterator();
        while(it.hasNext()){
        E ASP=it.next();
        s+=ASP.toString()+"";
         }
        return s;
        }
}
}
     



    



    

