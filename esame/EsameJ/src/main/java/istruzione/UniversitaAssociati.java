/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istruzione;

/**
 *
 * @author marco.albanese
 */
public class UniversitaAssociati extends università{
    private DocenteAssociato[]docentiAssociati ;
    
    public UniversitaAssociati(DocenteAssociato[] da){
        docentiAssociati=new DocenteAssociato[da.length];
         for(int i=0;i<da.length;i++)
            docentiAssociati[i]=new DocenteAssociato(da[i]);
        
    }

    
    
    
    
}
