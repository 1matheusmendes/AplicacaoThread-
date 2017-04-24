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
public class MainThread extends java.lang.Thread{
    
    private boolean rodando;
    ArrayList<Long> ListaTarefas = new ArrayList<> ();

    public boolean isRodando() {
        return rodando;
    }

    public void setRodando(boolean rodando) {
        this.rodando = rodando;
    }

    public ArrayList<Long> getListaTarefas() {
        return ListaTarefas;
    }

    public void setListaTarefas(ArrayList<Long> ListaTarefas) {
        this.ListaTarefas = ListaTarefas;
    }
    
    public void adicionarTarefa(Tarefa terefa){
        
    }
    
    public void run(){
        
    }
  
}
