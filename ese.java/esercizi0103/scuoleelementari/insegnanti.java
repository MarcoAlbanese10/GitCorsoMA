/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scuoleelementari;

/**
 *
 * @author marco.albanese
 */
public class insegnanti {
    private String nome;
    private String cognome;
    private String annoVincita;
    private String scuola;

    public insegnanti(String nome, String cognome, String annoVincita, String scuola) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoVincita = annoVincita;
        this.scuola = scuola;
    }

    public String getNome() {
        return nome;
    }

   

    public String getCognome() {
        return cognome;
    }

    

    public String getAnnoVincita() {
        return annoVincita;
    }

    
    public String getScuola() {
        return scuola;
    }

    public void setScuola(String scuola) {
        this.scuola = scuola;
    }

    @Override
    public String toString() {
        return "insegnanti{" + "nome=" + nome + ", cognome=" + cognome + ", annoVincita=" + annoVincita + ", scuola=" + scuola + '}';
    }
    
}
