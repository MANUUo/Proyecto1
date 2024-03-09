import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Admin extends JFrame implements ActionListener {
    
    JButton btnRegistro, btn_salir, btn_eliminar, btn_editar;
    JTable table_doctor;
    private DefaultTableModel modelo;
    public Admin() {

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        JPanel tab1 = new JPanel(null);
        JPanel tab2 = new JPanel(null);
        JPanel tab3 = new JPanel(null);

        tabbedPane.addTab("Doctores", tab1);
        tabbedPane.addTab("Pacientes", tab2);
        tabbedPane.addTab("Productos", tab3);

        //============================Vista Doctores==================================0
        btnRegistro = new JButton("Crear");
        btnRegistro.setBounds(900, 25, 180, 50);
        btnRegistro.setVisible(true);
        btnRegistro.setEnabled(true);
        btnRegistro.addActionListener(this);
        btnRegistro.setBackground(new Color(202, 255, 191));
        tab1.add(btnRegistro);
        
        btn_salir = new JButton("Salir");
        btn_salir.setBounds(1100, 25, 180, 50);
        btn_salir.setVisible(true);
        btn_salir.addActionListener(this);
        btn_salir.setBackground(new Color(255, 127, 80));
        tab1.add(btn_salir);
        
        btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setBounds(1100, 100, 180, 50);
        btn_eliminar.setVisible(true);
        btn_eliminar.setEnabled(true);
        btn_eliminar.addActionListener(this);
        btn_eliminar.setBackground(new Color(202, 255, 191));
        tab1.add(btn_eliminar);
        
        btn_editar = new JButton("Editar");
        btn_editar.setBounds(900, 100, 180, 50);
        btn_editar.setVisible(true);
        btn_editar.setEnabled(true);
        btn_editar.addActionListener(this);
        btn_editar.setBackground(new Color(202, 255, 191));
        tab1.add(btn_editar);
        
        // Titulo
        JLabel lbl4 = new JLabel("Listado de Doctores");
        lbl4.setBounds(25, 25, 750, 50);
        lbl4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        lbl4.setBackground(new Color(202, 255, 191));
        lbl4.setOpaque(true);
        lbl4.setVerticalAlignment(SwingConstants.CENTER);
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setFont(new Font(lbl4.getFont().getFontName(), Font.BOLD, 24));
        lbl4.setVisible(true);

        tab1.add(lbl4);

        Object[] encabezados = {"Codigo", "Nombre Completo", "Genero", "Edad", "Especialidad"};

        modelo = new DefaultTableModel(null, encabezados);

        JTable tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(25, 80, 750, 570);

        tab1.add(scrollPane);
        
        //============================Vista Pacientes==================================
         JLabel titleLabel = new JLabel("Pacientes");
        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        titleLabel.setBounds(200, 10, 100, 30); 
        tab2.add(titleLabel);
        
        
        //==================================================================================0
        getContentPane().add(tabbedPane);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(202, 255, 191));
        tab1.setBackground((new Color(245, 245, 220)));
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistro) {
            RegistroDoc vtn_registro= new RegistroDoc();
            this.dispose();
        }
        
        if (e.getSource() == btn_salir) {
            Login vtn_login = new Login();
            this.dispose();
        }
        
        if (e.getSource() == btn_eliminar) {
            
            int idInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del usuario: ")); 
            
            for(int i = 0; i < Main.listaDoctores.size() ; i++){
                
                if (Main.listaDoctores.get(i).getCodigo()  == idInput){
                    
                    Main.listaDoctores.remove(i);
                }
            }

            this.dispose();

            Admin nuevaVentana = new Admin();
            nuevaVentana.setVisible(true);
            
            
        }
    }
}
