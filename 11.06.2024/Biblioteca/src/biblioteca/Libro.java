package biblioteca;

public class Libro extends Material {
    private String genero; 

    public Libro(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano);
        this.genero = genero;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género: " + genero);
    }
}
