/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    
    private String CPF;
    private String senha;
    
    private String alterarSenha(String senha){
        return senha;
    }
    public String efetuarLogin(String CPF, String senha){
    return CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa(String CPF, String senha) {
        this.CPF = CPF;
        this.senha = senha;
    }

    public Pessoa() {
    }
    
    
}