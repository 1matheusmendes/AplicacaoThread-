package aplicação;

import java.util.ArrayList;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class MainThread extends Thread {
    
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
    
    @Override
    public void run(){
        
    }
  
}
