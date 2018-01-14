package aplicação;

import java.util.ArrayList;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class Agenda{
    
    private ArrayList<Pessoa> listaPessoas; //Criação de uma lista de pessoas 
    private ArrayList<Tarefa> listaTarefas;
    
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
        this.listaTarefas.add(tarefa);
    }
    
    public void removerPessoa(Pessoa pessoa){
        this.listaPessoas.add(pessoa);
    }
    
    public void removerTarefa (Tarefa tarefa){
        this.listaTarefas.remove(tarefa);
    }
    
    public void atribuirTarefa(Pessoa pessoa ,Tarefa tarefa){                                        
        // Verifica se a pessoa existe na lista
        if(this.listaPessoas.contains(pessoa)){
            // Verifica se a pessoa já executa a tarefa
            if (this.listaPessoas.get( this.listaPessoas.indexOf(pessoa) ).getTarefas().contains(tarefa)){
                System.out.println("Esta pessoa já executa esta tarefa");
                return;
            }            
            // Caso esteja tudo ok, a tarefa é adicionada para a pessoa.
            this.listaPessoas.get( this.listaPessoas.indexOf(pessoa) ).getTarefas().add(tarefa);            
            // Adiciona a tarefa na lista de busca da thread
            MainThread.getInstance().adicionarTarefa(tarefa);            
            // Remove a tarefa da lista da agebda.
            this.listaTarefas.remove(tarefa);            
        }
        else
            System.out.println("Esta pessoa não existe");                
    }
    
    @Override
    public String toString(){
        return listaPessoas.toString();
    }
    
}
