/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author R
 */
public class LoginBean {
    private String nome;
    

    public LoginBean(String nome, String senha) {
        this.nome = nome;
        
    }

    public String getLogin() {
        return nome;
    }

    public void setLogin(String nome) {
        this.nome = nome;
    }

  

}
