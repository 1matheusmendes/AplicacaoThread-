package aplicação;

import java.util.ArrayList;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class MainThread extends Thread {
    
    private boolean rodando;
    private static MainThread instance;
    private ArrayList<Tarefa> listaTarefas;
    
    private MainThread(){       
        this.listaTarefas = new ArrayList<>();
    }
    
    // Retorna uma instancia unica da classe. (Singleton)
    public static MainThread getInstance(){
        if (instance == null)
            instance = new MainThread();
        return instance;
    }

    public boolean isRodando() {
        return rodando;
    }

    public void setRodando(boolean rodando) {
        this.rodando = rodando;
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> ListaTarefas) {
        this.listaTarefas = ListaTarefas;
    }
    
    public void adicionarTarefa(Tarefa terefa){
        this.listaTarefas.add(terefa);
    }
    
    public void removerTarefa(Tarefa tarefa){
        this.listaTarefas.remove(tarefa);
    }
    
    @Override
    public void run(){
        
        while (rodando){
            
        }
        
    }
  
}
