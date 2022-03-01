/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author marco.albanese
 */
public class ellisse extends FiguraGeometrica {

    protected double semiasse_min, semiasse_magg;

    public ellisse(double semiasse_min, double semiasse_magg) {
        this.semiasse_min = semiasse_min;
        this.semiasse_magg = semiasse_magg;
    }

    public ellisse(double semiasse_min, double semiasse_magg, String descrizione) {
        super(descrizione);
        this.semiasse_min = semiasse_min;
        this.semiasse_magg = semiasse_magg;
    }

    public double getSemiasse_min() {
        return semiasse_min;
    }

    public void setSemiasse_min(double semiasse_min) {
        this.semiasse_min = semiasse_min;
    }

    public double getSemiasse_magg() {
        return semiasse_magg;
    }

    public void setSemiasse_magg(double semiasse_magg) {
        this.semiasse_magg = semiasse_magg;
    }

   public double Area() {
        return semiasse_min * semiasse_magg * 3.141;
    }

    @Override
    public String toString() {
        return "ellisse{" + "semiasse_min=" + semiasse_min + ", semiasse_magg=" + semiasse_magg + '}';
    }
    
}
