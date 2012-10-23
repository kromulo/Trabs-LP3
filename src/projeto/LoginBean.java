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
    private String login;
    private String senha;

    public LoginBean(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     
}
