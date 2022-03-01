/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author marco.albanese
 */
abstract class FiguraGeometrica {
    
	protected String descrizione;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double Area() {
        return 0;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "descrizione=" + descrizione + '}';
    }

}

