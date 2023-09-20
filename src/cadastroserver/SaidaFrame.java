/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserver;

/**
 *
 * @author 
 */
import javax.swing.JDialog;
import javax.swing.JTextArea;

public class SaidaFrame extends JDialog {

    private JTextArea texto;

    public SaidaFrame() {
        inicializarComponentes();
        configurarJanela();
    }

    private void inicializarComponentes() {
        setBounds(100, 100, 400, 300);
        texto = new JTextArea();
        add(texto);
    }

    private void configurarJanela() {
        setVisible(true);
        setModal(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Fechar a janela ao clicar no "X"
        setTitle("Saída"); // Define um título para a janela
    }

    public JTextArea getTexto() {
        return texto;
    }

    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }
}
