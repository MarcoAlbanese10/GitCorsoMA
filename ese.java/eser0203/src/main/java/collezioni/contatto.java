/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collezioni;

/**
 *
 * @author marco.albanese
 */
public class contatto {
    private String nome;
    private String cognome;
    private String numeroTelefonico;

    public contatto(String nome, String cognome, String numeroTelefonico) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    @Override
    public String toString() {
        return "contatto{" + "nome=" + nome + ", cognome=" + cognome + ", numeroTelefonico=" + numeroTelefonico + '}';
    }
    
    
}
