/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automobili;

/**
 *
 * @author marco.albanese
 */
public class ClassAuto {
     
    //campi dati variabili
    private ClassPersona proprietario;
    private String targa ;
    private String modello;
    private String colore;
    
    //campi funzione(metodi)
    public ClassAuto(String t, String m, String c){
        targa = t; modello = m; colore =c; proprietario = null;
    }
    public ClassAuto(String t, String m, String c, ClassPersona p ){
        targa = t; modello = m; colore = c; proprietario= p;
                }
    //funzionalità pubbliche classi
    public String getTarga(){
        return targa;
    }
    public String getModello(){
        return modello;
    }
    public String getColore(){
        return colore;
    }
    public void SetColore(String nuovoc){
        colore = nuovoc;
    }
    public ClassPersona getProprietario(){
         return proprietario;
    }
    public void setProprietario(ClassPersona nuovop){
        proprietario = nuovop;
    }
}

 