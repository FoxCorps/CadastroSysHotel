/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static String server = "localhost";
    public static String bd = "epiz_31083203_syscheckin";
    public static String username = "root";
    public static String senha = "";
    public static Connection comunica = getConexao();

    public static java.sql.Connection getConexao() {

        Connection conexao = null;
        try {
            String drive = "com.mysql.jdbc.Driver"; //pegando o driver
            Class.forName(drive);

            conexao = DriverManager.getConnection("jdbc:mysql://" + server + "/" + bd + "?autoReconnect=true", username, senha); //gerando conexao

            if (conexao != null) {
                System.out.println("Conectado");
            }
            return conexao;

        } catch (ClassNotFoundException e) {
            System.out.println("Erro na conexão");
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close() {
        try {
            comunica.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
