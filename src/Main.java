import java.util.ArrayList;

public class Main {
    
    public static ArrayList<Doctor> listaDoctores = new ArrayList<>();
    public static int codigo = 1;
    
    public static void main(String[] args) {
        
        Login vtn_login = new Login();

    }

    public static Object[][] convertirDatosDoctores_tabla() {
        
        int filas = listaDoctores.size();
        Object[][] arreglo = new Object[filas][5];

        for (int i = 0; i < filas; i++) {
            Doctor doctor = listaDoctores.get(i);
            arreglo[i][0] = doctor.getCodigo();
            arreglo[i][1] = doctor.getNombre();
            arreglo[i][2] = doctor.getApellido();
            arreglo[i][3] = doctor.getGenero();
            arreglo[i][4] = doctor.getEdad();
            arreglo[i][5] = doctor.getEspecialidad();
        }

        return arreglo;
    }

    public static void agregar_doctor(int codigo, String nombre, String apellido, String genero, int edad, String especialidad) {
        Doctor new_date = new Doctor(codigo, nombre, apellido, genero, edad, especialidad);
        listaDoctores.add(new_date);
    }

}
