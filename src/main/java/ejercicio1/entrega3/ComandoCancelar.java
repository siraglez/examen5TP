package ejercicio1.entrega3;

public class ComandoCancelar implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("Cancelando reserva.");
    }
}
