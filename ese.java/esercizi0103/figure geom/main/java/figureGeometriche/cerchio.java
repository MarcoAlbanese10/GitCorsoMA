/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author marco.albanese
 */
public class cerchio extends ellisse {

    protected double raggio;
     public cerchio(double raggio, String descrizione) {
        super(raggio, raggio, descrizione);
    }
     public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "cerchio{" + "raggio=" + raggio + '}';
    }

    
}


    
    

  
    

