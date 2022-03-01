/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author marco.albanese
 */
public class quadrato extends rettangolo {
    protected double lato;
          

      public quadrato(double lato, String descrizione) {
        super(lato,lato,descrizione);
    
     
      }

     public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public String toString() {
        return "quadrato{" + "lato=" + lato + '}';
    }
    

 

}
