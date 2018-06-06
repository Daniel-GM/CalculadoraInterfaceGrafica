package cadastrodecliente;
import java.awt.*;
import javax.swing.*;

public class CadastroDeCliente extends JFrame{
//    public static final int LARGURA_PADRAO = Toolkit.getDefaultToolkit().getScreenSize().width;
//    public static final int ALTURA_PADRAO = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static final int LARGURA_PADRAO = 408;
    public static final int ALTURA_PADRAO = 487;

    private JTextField txt = new JTextField();;
    private JPanel jp1 = new JPanel();

    public CadastroDeCliente() throws HeadlessException{

        setTitle("Calculadora"); //titulo da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //colocando a operação de finalizar o programa quando a tela for fechada
        setSize(LARGURA_PADRAO/2, ALTURA_PADRAO/2); //definindo o tamanho da tela
        setLocationRelativeTo(null); //colocando a janela no meio da tela

        txt.setPreferredSize(new Dimension(100,100));
        getContentPane().add(BorderLayout.NORTH,txt);

        jp1.setLayout(new GridLayout(4,4));
        jp1.add(new JButton(" 7 "));
        jp1.add(new JButton(" 8 "));
        jp1.add(new JButton(" 9 "));
        jp1.add(new JButton(" / "));
        jp1.add(new JButton(" 4 "));
        jp1.add(new JButton(" 5 "));
        jp1.add(new JButton(" 6 "));
        jp1.add(new JButton(" * "));
        jp1.add(new JButton(" 1 "));
        jp1.add(new JButton(" 2 "));
        jp1.add(new JButton(" 3 "));
        jp1.add(new JButton(" - "));
        jp1.add(new JButton(" . "));
        jp1.add(new JButton(" 0 "));
        jp1.add(new JButton(" = "));
        jp1.add(new JButton(" + "));
        add(jp1);

    }
}
