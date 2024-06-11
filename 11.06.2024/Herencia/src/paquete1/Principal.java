package paquete1;

public class Principal {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante(123, 3.5f,"Kevin ","Ramirez", 17);
        Estudiante estudiante2 = new Estudiante(345, 4.5f,"Nicolas ","Ruiz", 18);
        
        estudiante.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos(); 
    } 
}
