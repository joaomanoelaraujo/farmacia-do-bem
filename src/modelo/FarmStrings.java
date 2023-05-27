/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author NoxySystems
 */
public class FarmStrings {
     
    private int idEscola;
    private String rm; //Nome do Remédio
    private int saida; //Saida dos remédios
    private int qtd;//Quantidade do Remédio

    public FarmStrings() {
    }
    
    public FarmStrings(String rm, int saida, int qtd, int estoque, String bairro, String telefone, String diretor) {
        this.rm = rm; //Nome do remédio
        this.saida = saida; // Saida dos remédios
        this.qtd = qtd; // Quantidade do remédio

    }
   

    
    public int getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(int idEscola) {
        this.idEscola = idEscola;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int rua) {
        this.saida = saida;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }


}
