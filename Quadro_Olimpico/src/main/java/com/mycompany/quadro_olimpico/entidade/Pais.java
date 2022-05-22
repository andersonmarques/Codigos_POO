/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quadro_olimpico.entidade;

/**
 *
 * @author Anderson Soares
 */
public class Pais {
    private String nome;
    private int quantMedalhasOuro;
    private int quantMedalhasPrata;
    private int quantMedalhasBronze;

    public Pais(String nome){
        this.nome = nome;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantMedalhasOuro
     */
    public int getQuantMedalhasOuro() {
        return quantMedalhasOuro;
    }

    /**
     * @param quantMedalhasOuro the quantMedalhasOuro to set
     */
    public void setQuantMedalhasOuro(int quantMedalhasOuro) {
        if (quantMedalhasOuro < 0){
            this.quantMedalhasOuro = 0;
        }else{
            this.quantMedalhasOuro = quantMedalhasOuro;
        }        
    }

    /**
     * @return the quantMedalhasPrata
     */
    public int getQuantMedalhasPrata() {
        return quantMedalhasPrata;
    }

    /**
     * @param quantMedalhasPrata the quantMedalhasPrata to set
     */
    public void setQuantMedalhasPrata(int quantMedalhasPrata) {
        if (quantMedalhasPrata < 0){
            this.quantMedalhasPrata = 0;
        }else{
            this.quantMedalhasPrata = quantMedalhasPrata;
        } 
    }

    /**
     * @return the quantMedalhasBronze
     */
    public int getQuantMedalhasBronze() {
        return quantMedalhasBronze;
    }

    /**
     * @param quantMedalhasBronze the quantMedalhasBronze to set
     */
    public void setQuantMedalhasBronze(int quantMedalhasBronze) {
        if (quantMedalhasBronze < 0){
            this.quantMedalhasBronze = 0;
        }else{
            this.quantMedalhasBronze = quantMedalhasBronze;
        } 
    }
    
    
}
