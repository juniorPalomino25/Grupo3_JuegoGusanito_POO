package unmsm;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_inicio extends JFrame{
    private JPanel panel01;
    private JButton boton;
    
    public Login_inicio(){
        super("FisiGame");
        setSize(1000,800);
        setLocationRelativeTo(null);
        añadirComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        panel01.setBackground(Color.black);
    }
    
    public void añadirComponentes(){
        paneles();
        titulo();
        botonLogin();
    }
    
    public void paneles(){
        panel01 = new JPanel();
        panel01.setLayout(null);
        this.getContentPane().add(panel01);
    }
    
    public void titulo(){
        JLabel title = new JLabel();
        title.setText("FISIGAME");
        title.setFont(new Font("Cooper Black",0,100));
        title.setForeground(Color.BLUE);
        title.setBounds(234,240,532,100);
        panel01.add(title);
    }
    
    public void botonLogin(){
        boton = new JButton();
        boton.setBounds(450,390,100,30);
        boton.setText("INGRESAR");
        panel01.add(boton);
        abrirVentanaLogin();
    }
    
    public void abrirVentanaLogin(){
        ActionListener ingresar = new ActionListener() {    
        Login_entrada log = new Login_entrada();
            @Override
            public void actionPerformed(ActionEvent e) {
                log.setVisible(true);
                Login_inicio.this.dispose();
            }
        };
        boton.addActionListener(ingresar);
    }
}
