
package DTO;

import conexao.ConexaoBD;

/**
 *
 * @author 3° Ano Info
 */
public class Admin {
    private String user;
    private String senha;
    
    ConexaoBD conecta = new ConexaoBD();

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
