/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação;

import java.util.ArrayList;

/**
 *
 * @author MrMurdoc
 */
public class Pessoa {
    
    //O matheus da muito a bunda
    
    private String nome;
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

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
