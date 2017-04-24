package aplicação;

import java.util.Date;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class Tarefa {
    /**
     * Instaciamos os atibutos do obejto tarefa.
     */
    private String nome;
    private String descricao;
    private boolean feita;
    private Date data;
    private Horario horario;
    /**
     * Iniciando os metodos getters e setters
     * @return 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
}
