/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Anderson
 */
public class Pais {
    
    private String nome;
    private int quantMedalhaOuro;
    private int quantMedalhaPrata;
    private int quantMedalhaBronze;
    
    public Pais(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
            
    public void setQuantMedalhaOuro(int ouro){
        quantMedalhaOuro = ouro;
    }
    
    public int getQuantMedalhaOuro(){
        return quantMedalhaOuro;
    }    
            
    public void setQuantMedalhaPrata(int prata){
        quantMedalhaPrata = prata;
    }
    
    public int getQuantMedalhaPrata(){
        return quantMedalhaPrata;
    } 
            
    public void setQuantMedalhaBronze(int bronze){
        quantMedalhaBronze = bronze;
    }
    
    public int getQuantMedalhaBronze(){
        return quantMedalhaBronze;
    } 
}
