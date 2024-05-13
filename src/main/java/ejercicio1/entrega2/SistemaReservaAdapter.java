package ejercicio1.entrega2;

public class SistemaReservaAdapter implements SistemaExterno {
    private SistemaReserva sistemaReserva;

    public SistemaReservaAdapter(SistemaReserva sistemaReserva) {
        this.sistemaReserva = sistemaReserva;
    }

    @Override
    public void solicitarReserva() {
        sistemaReserva.realizarReserva();
    }
}
