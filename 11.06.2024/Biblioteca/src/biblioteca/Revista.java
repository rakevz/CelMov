package biblioteca;

public class Revista extends Material {
    private int numero; 

    public Revista(String titulo, String autor, int ano, int numero) {
        super(titulo, autor, ano);
        this.numero = numero;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número: " + numero);
    }
}
