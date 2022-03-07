/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import  DTO.Admin;
import com.mysql.jdbc.PreparedStatement;
import conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminDAO {
     public void create(Admin p) throws SQLException{
      
        Connection con =  ConexaoBD.getConexao();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO tb_admin (user,senha)VALUES(?,?)");
            
            stmt.setString(1,p.getUser());
            stmt.setString(2,p.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Sucesso ao inserir dados");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }finally{
           ConexaoBD.close();
        }
        
    
}
}
