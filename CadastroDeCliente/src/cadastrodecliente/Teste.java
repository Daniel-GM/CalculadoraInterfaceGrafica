package cadastrodecliente;

import javax.swing.SwingUtilities;

public class Teste {
    public static void main(String[] args) {
//        new SwingDemo01();
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new CadastroDeCliente().setVisible(true);
            }
        });
        
    }
}