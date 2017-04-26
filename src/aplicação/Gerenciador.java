package aplicação;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

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

    /**Metodo que lê as informações em um arquivo
     * 
     */
    public void lerDados(){
        
        FileInputStream fis = null;
        File arquivo = new File("dados.lopes");
        
        try{
            fis = new FileInputStream(arquivo);
            
            int data = fis.read();
            
            final ArrayList<Pessoa> listaPessoas = new ArrayList<>();
            ArrayList<Tarefa> listaTarefas = new ArrayList<>();
            Pessoa pessoa = new Pessoa();
            Tarefa tarefa = new Tarefa();
            
            String temp = "";
            
            final int PESSOA = 1;
            final int TAREFA = 2;
            final int NOME = 0;
            final int DESCRICAO = 1;
            final int FEITA = 2;
            final int DATA = 3;
            final int HORARIO = 4;
            
            int contador = 0;
            int contadorTarefa = 0;
            
            while( data != -1){                         
                char caractere = (char)data;                
                if(caractere == '['){
                    if(contador == 0){                        
                    }
                    if(contador == PESSOA){                        
                        pessoa = new Pessoa();
                        tarefa = new Tarefa();
                        pessoa.setNome(temp);                         
                        temp = "";
                    }                                        
                    contador++;                   
                }                
                if(caractere == ']'){
                    if(contador == PESSOA){                        
                    }
                    if(contador == TAREFA){      
                        
                        if(tarefa.getNome() != null)
                            listaTarefas.add(tarefa);
                        
                        pessoa.setTarefas(listaTarefas);
                        listaPessoas.add(pessoa);
                        listaTarefas = new ArrayList<>();
                        tarefa = new Tarefa();
                        contadorTarefa = 0;
                    }
                    contador--;                    
                }                
                if(caractere == ','){
                    if(contador == PESSOA){                        
                        pessoa = new Pessoa();
                        temp = "";
                    }                       
                    if(contador == TAREFA){                        
                        listaTarefas.add(tarefa);
                        tarefa = new Tarefa();
                        contadorTarefa = 0;
                        temp = "";
                    }
                }                
                if(caractere == '-'){
                    switch(contadorTarefa){
                        case NOME:
                            tarefa.setNome(temp);                           
                            break;
                        case DESCRICAO:
                            tarefa.setDescricao(temp);                            
                            break;
                        case FEITA:
                            tarefa.setFeita(true);                            
                            break;
                        case DATA:
                            tarefa.setData(null);                            
                            break;
                        case HORARIO:
                            tarefa.setHorario(null);                            
                            break;
                    }                    
                    temp = "";  
                    contadorTarefa++;
                }                
                if(caractere != '[' && caractere != ']' && caractere != ',' && caractere != '-'){                    
                    temp = temp + caractere;
                }                                
                if(caractere == ','){                    
                    data = fis.read();
                    data = fis.read();
                }
                else
                    data = fis.read();                
            }            
            agenda.setListaPessoas(listaPessoas);
                
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    /**Metodo que salva as informações em um arquivo
     * 
     */
    public void salvarDados(){
        
        FileOutputStream fos = null;        
        File arquivo = new File("dados.lopes");
        
        try{            
            fos = new FileOutputStream(arquivo);
            
            if(!arquivo.exists())
                arquivo.createNewFile();                        
            
            byte[] conteudoEmBytes = this.agenda.getListaPessoas().toString().getBytes();
            
            fos.write(conteudoEmBytes);
            fos.flush();
            fos.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }       
        
    }
    
    public static void alertar (Tarefa tarefa){
        
    }
}
