package ejercicio1.entrega2.patronAdicional;

import ejercicio1.entrega2.*;

public class Main {
    public static void main(String[] args) {
        //Ejemplo de uso
        RestauranteSimple restaurante1 = new RestauranteSimple("Restaurante 1");
        RestauranteSimple restaurante2 = new RestauranteSimple("Restaurante 2");

        GrupoRestaurantes grupo = new GrupoRestaurantes();
        grupo.agregarRestaurante(restaurante1);
        grupo.agregarRestaurante(restaurante2);

        grupo.mostrarInformacion();

        SistemaReserva sistemaReserva = new SistemaReserva();
        SistemaExterno sistemaExterno = new SistemaReservaAdapter(sistemaReserva);
        sistemaExterno.solicitarReserva();

        Sujeto sujeto = new Sujeto();
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        sujeto.notificar("Nuevo menú disponible");
    }
}
