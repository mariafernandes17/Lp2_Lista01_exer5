
package Main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author maria
 */
public class GUI extends JFrame {
    private Container cp;
    JLabel lb_codigo = new JLabel ("Código do Aluno:");
    JLabel lb_nota1 = new JLabel ("Nota 1:");
    JLabel lb_nota2 = new JLabel ("Nota 2:");
    JLabel lb_nota3 = new JLabel ("Nota 3:");
    JLabel lb_resultado = new JLabel();
    JTextField tf_codigo = new JTextField (20);
    JTextField tf_nota1 = new JTextField (20);
    JTextField tf_nota2 = new JTextField (20);
    JTextField tf_nota3 = new JTextField (20);
    JButton bt_calcular = new JButton("Calcular");

    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new GridLayout(5,2));

        setTitle("Exercício 5 - Lista 1");
        cp.add(lb_codigo);
        cp.add(tf_codigo);
        cp.add(lb_nota1);
        cp.add(tf_nota1);
        cp.add(lb_nota2);
        cp.add(tf_nota2);
        cp.add(lb_nota3);
        cp.add(tf_nota3);
        cp.add(bt_calcular);
        cp.add(lb_resultado);
        
        bt_calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Processamento processamento = new Processamento();
                processamento.setNota1(Double.parseDouble(tf_nota1.getText()));
                processamento.setNota2(Double.parseDouble(tf_nota2.getText()));
                processamento.setNota3(Double.parseDouble(tf_nota3.getText()));
                processamento.getMaiorNota();
                lb_resultado.setText(processamento.getResultado());
            }
        } );
        
    
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    setLocationRelativeTo(null);//centraliza no monitor
    setVisible(true);
    }
    
}
