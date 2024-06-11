package biblioteca;

public class Material {
    protected String titulo; 
    protected String autor;  
    protected int ano;      

    public Material(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
  
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + ano);
    }
}
