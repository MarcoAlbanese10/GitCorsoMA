/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istruzione;

/**
 *
 * @author marco.albanese
 */
public class DocenteAssociato extends Docente{
    String [] contratti;
    int VotoDiDottorato;

    public DocenteAssociato(String[] contratti, int VotoDiDottorato, Docente d) {
        super(d);
      
    }
    public DocenteAssociato(DocenteAssociato da){
        contratti=da.getContratti();
        VotoDiDottorato=da.getVotoDiDottorato();
     
        }
 
    public String[] getContratti() {
        return contratti;
    }

    public int getVotoDiDottorato() {
        return VotoDiDottorato;
    }
    
    
}
    
        
        
