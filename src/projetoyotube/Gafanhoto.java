/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyotube;

/**
 *
 * @author magno
 */
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.totAssistindo=0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }
    
    
    
}
