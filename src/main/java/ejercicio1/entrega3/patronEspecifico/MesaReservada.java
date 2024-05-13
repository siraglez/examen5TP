package ejercicio1.entrega3.patronEspecifico;

public class MesaReservada implements EstadoMesa {
    @Override
    public void solicitar(Mesa mesa) {
        System.out.println("La mesa ya está reservada.");
    }

    @Override
    public void ocupar(Mesa mesa) {
        System.out.println("Mesa ocupada.");
        mesa.cambiarEstado(new MesaOcupada());
    }

    @Override
    public void liberar(Mesa mesa) {
        System.out.println("Mesa liberada.");
        mesa.cambiarEstado(new MesaLibre());
    }
}
