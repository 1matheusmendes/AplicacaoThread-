package aplicação;

import java.util.ArrayList;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class Pessoa {
    /**
     * Instanciamos os objetos Nome e Lista 
     * Sendo ArrayLista como uma lista de tarefas
     */
    private String nome; //atributo nome
    private ArrayList<Tarefa> tarefas = new ArrayList<>(); //lista de tarefas ou vetor tarefas
    /**
     * Iniciação dos metodos getters e setters
     * @return 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    
}
