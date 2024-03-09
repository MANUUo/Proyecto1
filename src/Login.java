import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame implements ActionListener {
    
    private JTextField usuarioField;
    private JPasswordField contraseñaField;

    private JButton loginButton;

    public Login() {
        initComponents();
    }
    private void initComponents() {

        JLabel titleLabel = new JLabel("Bienvenido");
        titleLabel.setFont(new Font("", Font.BOLD , 25));
        titleLabel.setBounds(185, 1, 300, 50); 
        this.add(titleLabel);

        ImageIcon imageIcon = new ImageIcon("IS.png");
        Image imageDimension = imageIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon = new ImageIcon(imageDimension);
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 30, 120, 110);
        this.add(imageLabel);


        JLabel usuarioLabel = new JLabel("Código:");
        usuarioLabel.setBounds(70, 140, 80, 25);
        this.add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(130, 140, 260, 25);
        this.add(usuarioField);
        
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 180, 80, 25);
        this.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(130, 180, 260, 25);
        this.add(contraseñaField);


        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(140, 220, 230, 35);
        loginButton.setFont(new Font("", Font.BOLD, 20));
        loginButton.setBackground(new Color(202, 255, 191));
        loginButton.addActionListener(this); 
        this.add(loginButton); 
        
        
        JButton registerButton = new JButton("...o Registrate aquí");
        registerButton.setBounds(170, 270, 160, 25); //Ajuste de posición
        registerButton.setFont(new Font("", Font.BOLD, 12));
        registerButton.setForeground(new Color(50, 100, 50));
        registerButton.setOpaque(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setBorderPainted(false);
        registerButton.addActionListener(this);
        this.add(registerButton); 
        
        
        this.setTitle("Inicia Sesión");
        this.setBounds(600, 400, 500, 350);
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("usuario.png");
        this.setIconImage(imagen.getImage());
        this.getContentPane().setBackground(new Color(245, 245, 220));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Iniciar Sesión")) {
           
            String usuario = usuarioField.getText();
            char[] contraseña = contraseñaField.getPassword();
            String cta = new String(contraseña);

            if (usuario.equals("202302035") && cta.equals("Proyecto1IPC1")) {
                Admin vtn_admin = new Admin();
                this.dispose();
            //} else if(usuario.equals(usuarioField) && cta.equals(contraseñaField)) {
            
            } else {
               JOptionPane.showMessageDialog(this, "El usuario y/o la contraseña son incorrectas.", "Error con el LOGIN", 0);
            }
        }
            
        
        if (e.getSource() == loginButton) {

            String usuario = usuarioField.getText();
            char[] contraseña = contraseñaField.getPassword();
            
            if (usuario.equals("a") && contraseña.equals("a")) {
                
                
            } else {
                JOptionPane.showMessageDialog(this, "El usuario y/o la contraseña son incorrectas.", "Error con el LOGIN", 0);
            }
        }
        
        
        if (e.getActionCommand().equals("...o Registrate aquí")) {
            Registro registro = new Registro();
            
        }
    }
}
