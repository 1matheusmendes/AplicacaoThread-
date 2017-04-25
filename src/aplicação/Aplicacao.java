/**
 *Aplicação criada com ajuda de Henrique-dev
 *https://github.com/henrique-dev 
 */
package aplicação;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author MrMurdoc
 * @author Elfa1
 */
public class Aplicacao extends JFrame implements WindowListener, ActionListener{
    
    private Gerenciador gerenciador;
    TextField campoTexto;
    Button botao;

    public Aplicacao(String nomeJanela){
        super(nomeJanela);
        
        setLayout(new FlowLayout());
        addWindowListener(this);       
        addWindowListener(this);
        
        this.botao = new Button("Me clica por favor");
        this.botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                botaoActionPerformed();
            }
        });
        this.add(botao);
        this.campoTexto = new TextField(20);
        this.add(this.campoTexto);   
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        Aplicacao tela = new Aplicacao("Agenda");   
        tela.setSize(350, 100);
        tela.setVisible(true);
        
    }       
    
    public void botaoActionPerformed(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
