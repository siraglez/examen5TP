package ejercicio1.entrega3.patronEspecifico;

public class MesaOcupada implements EstadoMesa {
    @Override
    public void solicitar(Mesa mesa) {
        System.out.println("La mesa está ocupada.");
    }

    @Override
    public void ocupar(Mesa mesa) {
        System.out.println("La mesa ya está ocupada.");
    }

    @Override
    public void liberar(Mesa mesa) {
        System.out.println("Mesa liberada.");
        mesa.cambiarEstado(new MesaLibre());
    }
}
