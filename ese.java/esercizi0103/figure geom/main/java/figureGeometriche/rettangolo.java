/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author marco.albanese
 */
public class rettangolo extends FiguraGeometrica {
    private double base;
    private double altezza;

    public rettangolo(double base, double altezza, String descrizione) {
        super(descrizione);
        this.base = base;
        this.altezza = altezza;
    }

    public double area() {
        return base * altezza;
    }
}
