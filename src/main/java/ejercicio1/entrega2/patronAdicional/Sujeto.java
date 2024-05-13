package ejercicio1.entrega2.patronAdicional;

import java.util.List;
import java.util.ArrayList;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
