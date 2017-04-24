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
public class Agenda{
    
    ArrayList<Pessoa> listaPessoas;
    ArrayList<Tarefa> listaTarefas;
    
    public Agenda(){
        this.listaPessoas = new ArrayList<Pessoa>();
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    
    public void adicionarPessoas(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }
    
    public void adicionarTarefa(Tarefa tarefa){    
    }
    
    public void removerPessoa(Pessoa pessoa){
    }
    
    public void removerTareda (Tarefa tarefa){
    }
    
    public void atribuirTarefa(Pessoa pessoa ,Tarefa tarefa){
        
    }
    
}
