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
    
    ArrayList<Pessoa> listaPessoas = new ArrayList<> ();
    ArrayList<Tarefa> listaTarefas = new ArrayList<> ();

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
    
    public void adicionarPessoas(Pessoa Pessoas){
    }
    
    public void adicionarTarefa(Tarefa Tarefa){    
    }
    
    public void removerPessoa(Pessoa Pessoas){
    }
    
    public void removerTareda (Tarefa Tarefa){
    }
    
    public void atribuirTarefa(Pessoa Pessoa,Tarefa Tarefa){
        
    }
    
}
