import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RegistroDoc extends JFrame implements ActionListener {
    
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField edadField;
    private JComboBox<String> generoComboBox;
    private JTextField especialidadField;
    private JTextField codigoField;
    
    private JButton registerButton;
    
    public RegistroDoc() {
         initComponents();
    }
    
    private void initComponents() {
        
        ImageIcon imagen = new ImageIcon("usuario.png");
        this.setIconImage(imagen.getImage());
        
        JLabel titleLabel = new JLabel("Registro Doctor");
        titleLabel.setFont(new Font("", Font.BOLD, 25));
        titleLabel.setBounds(350, 10, 200, 30);
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
        edadLabel.setBounds(450, 95, 80, 25);
        this.add(edadLabel);

        edadField = new JTextField();
        edadField.setBounds(535, 95, 260, 25);
        this.add(edadField);

        JLabel especialidadLabel = new JLabel("Especialidad:");
        especialidadLabel.setBounds(450, 55, 80, 25);
        this.add(especialidadLabel);

        especialidadField = new JTextField();
        especialidadField.setBounds(535, 55, 260, 25);
        this.add(especialidadField);
        
        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(450, 138, 80, 25);
        this.add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(535, 138, 260, 25);
        this.add(codigoField);
        
        registerButton = new JButton("Registrate");
        registerButton.setBounds(325, 200, 230, 35);
        registerButton.setFont(new Font("", Font.BOLD, 20));
        registerButton.setBackground(new Color(202, 255, 191));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro Doctor");
        this.setBounds(650, 400, 900, 350);
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
            
                int codigo = Integer.parseInt(codigoField.getText());
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                int edad = Integer.parseInt(edadField.getText());
                String generoelegido = (String) generoComboBox.getSelectedItem();
                String especialidad = especialidadField.getText();
                //Main.add(new Doctor(codigo, nombre, apellido, generoelegido, edad, especialidad));

            Main.codigo++;
            this.dispose();
            
            Admin vtn_admin = new Admin();
        }
    }
    
}
