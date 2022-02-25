/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova.java.Classi;

/**
 *
 * @author marco.albanese
 */
public class Persona {
    //campi dati variabili
    private String nome;
    private String residence;
    
    
    public Persona(String nome, String residence){
    this.nome=nome;
    this.residence=residence;
}

    //campi funzione(metodi)
    public String getNome() {
        return nome;
    }
    public String getResidence(){
        return residence;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResidence(String residence) {
        this.residence = residence;
        
    }
    
}
