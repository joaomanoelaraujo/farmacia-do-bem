package connection;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.FarmStrings;

/**
 *
 * @author NoxySystems
 */
public class TabelasDB implements DbGenerica<FarmStrings>{
   private ConexaoBanco conexao;
    
    public TabelasDB()
    {
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(FarmStrings escola) {
        //string com a consulta que será executada no banco
        String sql = "INSERT INTO geral (RM_NOME, RM_QTD) VALUES (?,?)";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                sentenca.setString(1,escola.getRm()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                sentenca.setInt(2,escola.getQtd()); //subsitui a terceira ocorrência da interrogação pelo atributo número
                
                sentenca.execute(); //executa o comando no banco
                sentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(FarmStrings escola) {
        String sql = "UPDATE geral SET RM_NOME = ?, RM_QTD = ? WHERE IDRM = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,escola.getRm());
                sentenca.setInt(2,escola.getQtd());
                sentenca.setInt(3,escola.getIdEscola());
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    
    
    @Override
    public void excluir() {
        String sql = "DELETE FROM geral";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
    public void excluirID(int id) {
        String sql = "DELETE FROM geral WHERE IDRM = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
 
 
 
    @Override
    public ArrayList<FarmStrings> consultar() {
        
        ArrayList<FarmStrings> listaEscolas = new ArrayList<FarmStrings>();
        String sql = "SELECT * FROM geral ORDER BY IDRM";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    FarmStrings escola = new FarmStrings();
                    escola.setIdEscola(resultadoSentenca.getInt("IDRM"));
                    escola.setRm(resultadoSentenca.getString("RM_NOME"));
                    escola.setQtd(resultadoSentenca.getInt("RM_QTD"));

                   
                    //adiciona cada tupla na listaEscolas que será retornada para a janela Escola
                    listaEscolas.add(escola);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaEscolas;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

}
