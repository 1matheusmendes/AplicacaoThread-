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
    
    //O matheus da a bunda.
    
    private String nome;
    private ArrayList<Long> tarefas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Long> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Long> tarefas) {
        this.tarefas = tarefas;
    }
    
    
}
