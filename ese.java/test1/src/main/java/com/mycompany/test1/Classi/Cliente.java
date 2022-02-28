/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova.java.Classi;

/**
 *
 * @author marco.albanese
 */
public class Cliente {
    
        private String nome;
    private String residence;

    public Cliente(String nome, String residence) {
        this.nome = nome;
        this.residence = residence;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    
}
