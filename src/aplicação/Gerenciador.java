package aplicação;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class Gerenciador {
    /**
     * Atributos da Classe Gerencidor 
     */
    private static Gerenciador instancia;
    private Agenda agenda;
    private Thread MainThread;
    
    public static Gerenciador getInstancia(){
        if(instancia == null)
            instancia = new Gerenciador();
        return instancia;            
    }
    
    private Gerenciador(){
        agenda = new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }        

    public Agenda lerDados(){
        return null;     
    }
    
    public void salvarDados(Agenda agenda){
        
    }
    
    public static void alertar (Tarefa tarefa){
        
    }
}
