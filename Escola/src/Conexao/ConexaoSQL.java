package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {

    public static String status = "N�o conectou...";

//Método Construtor da Classe//
    public ConexaoSQL() {

    }

//Método de Conexão//
    public static Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection

        try {

// Carregando o JDBC Driver padrão
            String driverName = "com.mysql.jdbc.Driver";      //encontra-se na biblioteca                  

            Class.forName(driverName);

// Configurando a nossa conexão com um banco de dados//
            String serverName = "escola";    //caminho do servidor do BD

            String mydatabase = "localhost:3306";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;//server:numeroDaPorta

            String username = "root";        //nome de um usuário de seu BD      

            String password = "xy234786";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (connection != null) {

                status = ("STATUS: Conectado com sucesso!");

            } else {

                status = ("STATUS: N�o foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

//Não conseguindo se conectar ao banco
            System.out.println("N�o foi possivel conectar ao Banco de Dados.");

            return null;
        }

    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {

        return status;

    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            ConexaoSQL.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    //Método que reinicia sua conexão//
    public static Connection ReiniciarConexao() {

        FecharConexao();
        return ConexaoSQL.getConexaoMySQL();
    }
}
