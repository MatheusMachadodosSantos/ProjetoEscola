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
public class Produto {
  
   private String nomeProduto;
   private int qntProduto;
   private float preçoMedio;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    public float getPreçoMedio() {
        return preçoMedio;
    }

    public void setPreçoMedio(float preçoMedio) {
        this.preçoMedio = preçoMedio;
    }

    public Produto(String nomeProduto, int qntProduto, float preçoMedio) {
        this.nomeProduto = nomeProduto;
        this.qntProduto = qntProduto;
        this.preçoMedio = preçoMedio;
    }

    public Produto() {
    }
   
   
}
