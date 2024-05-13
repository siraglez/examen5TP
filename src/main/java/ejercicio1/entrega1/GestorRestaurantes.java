package ejercicio1.entrega1;

public class GestorRestaurantes {
    private static GestorRestaurantes instance;

    private GestorRestaurantes() {}

    public static synchronized GestorRestaurantes getInstance() {
        if (instance == null) {
            instance = new GestorRestaurantes();
        }
        return instance;
    }

    public void gestionar() {
        System.out.println("Gestionando restaurantes de forma centralizada.");
    }
}
