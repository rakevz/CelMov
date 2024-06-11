package biblioteca;

public class Periodico extends Material {
    private String fecha; // Fecha del periódico

    public Periodico(String titulo, String autor, int ano, String fecha) {
        super(titulo, autor, ano);
        this.fecha = fecha;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha: " + fecha);
    }
}
