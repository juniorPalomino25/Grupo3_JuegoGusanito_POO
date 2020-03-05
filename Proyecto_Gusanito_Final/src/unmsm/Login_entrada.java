package unmsm;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Login_entrada extends JFrame {
 private JPanel panel02;
    private JTextField cuadro1,cuadro2;
    //private String user,contra;
    private JButton jugar;
    
    public Login_entrada(){
        super("LOGIN");
        setSize(1000,800);
        setLocationRelativeTo(null);
        a�adirComp();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel02.setBackground(Color.white);
    }
    
    public void a�adirComp(){
        panel();
        title();
        cuadrosdeingreso1();
        //contra = cuadrosdeingreso2();
        //botonJugar();
    }
    
    public void panel(){
        panel02 = new JPanel();
        panel02.setLayout(null);
        this.getContentPane().add(panel02);       
    }
    
    public void title(){
        //Titulo del juego
        JLabel titu = new JLabel();
        titu.setText("FISIGAME");
        titu.setFont(new Font("Cooper Black",0,100));
        titu.setForeground(Color.red);      
        titu.setBounds(234,195,532,100);
        
        //Nombre de usuario
        JLabel user = new JLabel();
        user.setText("USUARIO:");
        user.setFont(new Font("Arial",1,20));
        user.setForeground(Color.blue);
        user.setBounds(350,330,96,30);
        
        /*//Nombre de usuario
        JLabel pass = new JLabel();
        pass.setText("CLAVE:");
        pass.setFont(new Font("Arial",1,20));
        pass.setForeground(Color.blue);
        pass.setBounds(374,370,72,30);*/
        
        //AÃ±adimos las etiquetas al panel
        //panel02.add(pass);
        panel02.add(titu);
        panel02.add(user);
    } 
    
    public void cuadrosdeingreso1(){     
        
        cuadro1 = new JTextField();
        cuadro1.setBounds(453,332,200,30);
        
        panel02.add(cuadro1);
        botonJugar();   
    }
    
    /*public String cuadrosdeingreso2(){
        String password;
        //ContraseÃ±a
        cuadro2 = new JTextField();
        cuadro2.setBounds(453,372,200,30);
        password = cuadro2.getText();
        panel02.add(cuadro2);
        return password;
    }
    */
    public void botonJugar(){
        jugar = new JButton();
        jugar.setBounds(465,450,100,30);
        jugar.setText("JUGAR");
        panel02.add(jugar); 
        
       MouseListener ac = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                String usuario;
                Juego game=new Juego();
                try{
                    usuario = cuadro1.getText();
                    
                    //JOptionPane.showMessageDialog(null, usuario);
                    //System.out.println("aa");
                }catch(NullPointerException ex){
                    ex.printStackTrace();
                    //JOptionPane.showMessageDialog(null,"Ingrese de nuevo"+"\nUsuario invalido");
                    //System.out.println("bb");
                }
                Login_entrada.this.dispose();
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        jugar.addMouseListener(ac);
        
    }
    public void mostrar(){
        
    }
    
}
