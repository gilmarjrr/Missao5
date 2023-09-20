/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroserver;

/**
 *
 * @author 
 */
import java.io.IOException;
import javax.swing.SwingUtilities;

public class CadastroServer {

    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(CadastroServer::iniciarAplicacao);
    }

    private static void iniciarAplicacao() {
        SaidaFrame frame = new SaidaFrame();
        ThreadClient client = new ThreadClient(frame.getTexto());
        client.start();
    }
}

