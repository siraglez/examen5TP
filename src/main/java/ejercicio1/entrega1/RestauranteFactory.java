package ejercicio1.entrega1;

public class RestauranteFactory {
    public Restaurante getRestaurante(String tipo) {
        if (tipo.equalsIgnoreCase("rápido")) {
            return new RestauranteRapido();
        } else if (tipo.equalsIgnoreCase("temático")) {
            return new RestauranteTematico();
        } else if (tipo.equalsIgnoreCase("de lujo")) {
            return new RestauranteDeLujo();
        }
        return null;
    }
}
