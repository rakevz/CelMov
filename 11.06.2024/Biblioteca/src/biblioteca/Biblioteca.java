package biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela");
        Revista revista = new Revista("National Geographic", "Varios", 2021, 305);
        Periodico periodico = new Periodico("El País", "Varios", 2024, "06-06-2024");

        System.out.println("Información del Libro:");
        libro.mostrarInfo();

        System.out.println("\nInformación de la Revista:");
        revista.mostrarInfo();

        System.out.println("\nInformación del Periódico:");
        periodico.mostrarInfo();
    }
}
