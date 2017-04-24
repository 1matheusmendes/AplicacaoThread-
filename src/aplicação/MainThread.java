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
public class MainThread {
    
    private boolean rodando;
    ArrayList<Tarefa> ListaTarefas = new ArrayList<> ();

    public boolean isRodando() {
        return rodando;
    }

    public void setRodando(boolean rodando) {
        this.rodando = rodando;
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return ListaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> ListaTarefas) {
        this.ListaTarefas = ListaTarefas;
    }
    
    public void adicionarTarefa(Tarefa terefa){
        
    }
    
    public void run(){
        
    }
  
}
