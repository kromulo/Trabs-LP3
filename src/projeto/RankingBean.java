/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author R
 */
public class RankingBean {
    private String nome;

    public RankingBean(String nome, Float tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(Float tempo) {
        this.tempo = tempo;
    }

    public Float getTempo() {
        return tempo;
    }
    private Float tempo;
}
