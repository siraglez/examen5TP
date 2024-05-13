package ejercicio1.entrega3.patronEspecifico;

import ejercicio1.entrega3.*;

public class Main {
    public static void main(String[] args) {
        //Ejemplo de uso
        ComandoReservar comandoReservar = new ComandoReservar();
        ComandoOrdenar comandoOrdenar = new ComandoOrdenar();
        ComandoCancelar comandoCancelar = new ComandoCancelar();

        comandoReservar.ejecutar();
        comandoOrdenar.ejecutar();
        comandoCancelar.ejecutar();

        Cocina cocina = new Cocina();
        ServicioCliente servicioCliente = new ServicioCliente();
        Entrega entrega = new Entrega();

        Mediator mediator = new Mediator(cocina, servicioCliente, entrega);
        mediator.ejecutarPedido();

        Mesa mesa = new Mesa();
        mesa.solicitar();
        mesa.ocupar();
        mesa.liberar();
    }
}
