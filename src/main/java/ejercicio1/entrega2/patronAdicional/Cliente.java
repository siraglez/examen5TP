package ejercicio1.entrega2.patronAdicional;

public class Cliente implements Observador {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Cliente " + nombre + " recibió la notificación: " + mensaje);
    }
}
