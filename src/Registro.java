import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Registro extends JFrame implements ActionListener{
    
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField edadField;
    private JComboBox<String> generoComboBox;
    private JTextField contraseñaField;

    private JButton registerButton;
    
    public Registro() {
         initComponents();
    }
    
    private void initComponents() {
        
        ImageIcon imagen = new ImageIcon("usuario.png");
        this.setIconImage(imagen.getImage());
        
        JLabel titleLabel = new JLabel("Registro");
        titleLabel.setFont(new Font("", Font.BOLD, 25));
        titleLabel.setBounds(200, 10, 100, 30);
        this.add(titleLabel);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(70, 55, 80, 25);
        this.add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(130, 55, 260, 25);
        this.add(nombreField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoLabel.setBounds(70, 95, 80, 25);
        this.add(apellidoLabel);

        apellidoField = new JTextField();
        apellidoField.setBounds(130, 95, 260, 25);
        this.add(apellidoField);

        JLabel generoLabel = new JLabel("Género:");
        generoLabel.setBounds(70, 138, 80, 25);
        this.add(generoLabel);

        String[] generos = {"Masculino", "Femenino", "39 Tipos de Gay"};
        generoComboBox = new JComboBox<>(generos);
        generoComboBox.setBounds(130, 138, 150, 25);
        this.add(generoComboBox);
        
        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(80, 180, 80, 25);
        this.add(edadLabel);

        edadField = new JTextField();
        edadField.setBounds(130, 180, 260, 25);
        this.add(edadField);
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(45, 220, 80, 25);
        this.add(contraseñaLabel);

        contraseñaField = new JTextField();
        contraseñaField.setBounds(130, 220, 260, 25);
        this.add(contraseñaField);

        registerButton = new JButton("Registrate");
        registerButton.setBounds(140, 250, 230, 35);
        registerButton.setFont(new Font("", Font.BOLD, 20));
        registerButton.setBackground(new Color(202, 255, 191));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(245, 245, 220));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Registrate")) {
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            int edad = Integer.parseInt(edadField.getText());
            String generoelegido = (String) generoComboBox.getSelectedItem();

            Main.codigo++;
            this.dispose();
            
            Admin vtn_admin = new Admin();
        }
    }
}
