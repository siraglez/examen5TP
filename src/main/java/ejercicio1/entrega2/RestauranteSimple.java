package ejercicio1.entrega2;

public class RestauranteSimple implements ComponenteRestaurante {
    private String nombre;

    public RestauranteSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Restaurante: " + nombre);
    }
}
