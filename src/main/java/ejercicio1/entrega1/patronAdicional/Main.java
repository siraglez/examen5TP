package ejercicio1.entrega1.patronAdicional;

import ejercicio1.entrega1.GestorRestaurantes;
import ejercicio1.entrega1.Restaurante;
import ejercicio1.entrega1.RestauranteFactory;

public class Main {
    public static void main(String[] args) {
        //Ejemplo de uso
        RestauranteFactory restauranteFactory = new RestauranteFactory();

        Restaurante restaurante1 = restauranteFactory.getRestaurante("rápido");
        restaurante1.servirCliente();

        GestorRestaurantes gestor = GestorRestaurantes.getInstance();
        gestor.gestionar();

        EstrategiaServicio estrategia = new EstrategiaServicioRapido();
    }
}
