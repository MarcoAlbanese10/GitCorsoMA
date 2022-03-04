/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istruzione;

/**
 *
 * @author marco.albanese
 */
public class università {
    private Docente[]docenti;
    
    public università(Docente[] d){
        docenti=new Docente[d.length];
         for(int i=0;i<d.length;i++)
            docenti[i]=new Docente(d[i]);
        
    }
    
    public int etaMinima(){
    int min=docenti[0].getEtà();
    for(int i=1;i<=docenti.length;i++)
    if(docenti[i].getEtà()<min) min=docenti[i].getEtà();
    return min;
}
    public String[] trovaGiovani(){
        String [] risultato;
        int cont =0;
        for(int i=0;i<docenti.length;i++)
        if(docenti[i].getEtà()==etaMinima()) cont++;
        risultato=new String[cont];
        cont=0;
        for(int i=0;i<docenti.length;i++)
        if(docenti[i].getEtà()==etaMinima()){
        risultato[i]=docenti[i].getCognome();
        cont++;
        }
    return risultato;
    }
    
    
}
    

