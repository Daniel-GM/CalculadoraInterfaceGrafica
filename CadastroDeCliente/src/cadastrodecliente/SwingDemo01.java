package cadastrodecliente;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class SwingDemo01 {
    private JLabel lbl;
    
    public SwingDemo01(){
        JFrame cadastroDeCliente = new JFrame("Cadastro de cliente");
        cadastroDeCliente.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lbl = new JLabel();
        
        int largura = Toolkit.getDefaultToolkit().getScreenSize().width;
        int altura = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        cadastroDeCliente.getContentPane().add(lbl);
        
        cadastroDeCliente.setSize(largura/2,altura/2);
        cadastroDeCliente.setLocation(altura/4, altura/4);
        cadastroDeCliente.setVisible(true);
    }
}
