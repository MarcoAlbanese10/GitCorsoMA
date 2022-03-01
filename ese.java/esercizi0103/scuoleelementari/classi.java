/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scuoleelementari;

import java.util.Arrays;

/**
 *
 * @author marco.albanese
 */
public class classi {
    private String scuola;
    private String nome;
    private String numAlunni;
   
    public classi(String scuola, String nome, String insegnanti, String numAlunni) {
        this.scuola = scuola;
        this.nome = nome;
        this.numAlunni = numAlunni;
    }

    public String getScuola() {
        return scuola;
    }

    

    public String getNome() {
        return nome;
    }
    public String getNumAlunni() {
        return numAlunni;
    }

    public void setNumAlunni(String numAlunni) {
        this.numAlunni = numAlunni;
    }
     public static void main(String[] args){
    
            int [] arr  = {"A..","B...","C..."};
  
  
    
		Arrays.sort(arr);
    }

		
		
    

    @Override
    public String toString() {
        return "classi{" + "scuola=" + scuola + ", nome=" + nome + ", insegnanti=" + insegnanti + ", numAlunni=" + numAlunni + '}';
    }
    
}
    

