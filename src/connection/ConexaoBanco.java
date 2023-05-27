package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NoxySystems
 */
public class ConexaoBanco {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public ConexaoBanco()
    {
        this.servidor = "database.haskhosting.com.br";
        this.banco = "s257_senacintregador";
        this.usuario = "u257_4wywH8mjtW";
        this.senha = "XTA9GE5ap^xH6ve8@jE3hNPM";
    }
    
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }

}
