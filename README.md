link al repositorio: https://github.com/siraglez/examen5TP.git

# Ejercicio 1: Gestión de una Cadena de Restaurantes

## Entrega 1: Patrones de Construcción

Este código Java implementa tres patrones de diseño comunes: Factory, Singleton y Strategy.

### 1. Factory:

El patrón Factory se emplea para crear objetos sin especificar la clase exacta del objeto que se creará. En este caso, la clase `RestauranteFactory` tiene un método `getRestaurante(String tipo)` que devuelve un objeto `Restaurante` según el tipo proporcionado, ya sea "rápido", "temático" o "de lujo". Cada tipo de restaurante tiene su propia clase que implementa la interfaz `Restaurante`.

### 2. Singleton:

El patrón Singleton se utiliza para garantizar que una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia. La clase `GestorRestaurantes` asegura que solo haya una instancia de sí misma mediante un campo estático `instance` y un constructor privado. El método `getInstance()` devuelve siempre la misma instancia, creándola solo si aún no existe.

### 3. Strategy:

El patrón Strategy se emplea para definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. La interfaz `EstrategiaServicio` define un método `ejecutar()` que representa el algoritmo a ejecutar. Luego, hay tres clases que implementan esta interfaz, cada una con su propia implementación del método `ejecutar()`: `EstrategiaServicioRapido`, `EstrategiaServicioTematico` y `EstrategiaServicioDeLujo`.


## Entrega 2: Patrones de Estructuración

Este código Java muestra la implementación de tres patrones de diseño distintos: Composite, Adapter y Observer.

### 1. Composite:

El patrón Composite se utiliza para tratar a los objetos individuales y a las composiciones de objetos de manera uniforme. En este caso, se define una interfaz `ComponenteRestaurante` que declara un método `mostrarInformacion()`. Luego, se tienen dos clases: `RestauranteSimple`, que implementa esta interfaz y representa un restaurante individual, y `GrupoRestaurantes`, que también implementa la interfaz pero representa un grupo de restaurantes, permitiendo agregar y mostrar información sobre varios restaurantes a la vez.

### 2. Adapter:

El patrón Adapter se utiliza para permitir que interfaces incompatibles trabajen juntas. En este caso, se tiene una interfaz `SistemaExterno` con un método `solicitarReserva()`, y una clase `SistemaReserva` que tiene un método `realizarReserva()`. La clase `SistemaReservaAdapter` implementa la interfaz `SistemaExterno` y actúa como un adaptador entre la interfaz del sistema externo y la clase `SistemaReserva`, permitiendo que un sistema externo solicite una reserva sin necesidad de conocer los detalles de implementación de la clase `SistemaReserva`.

### 3. Observer:

El patrón Observer se utiliza para definir una dependencia de uno a muchos entre objetos, de manera que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente. En este caso, se define una interfaz `Observador` con un método `actualizar(String mensaje)`, y una clase `Sujeto` que tiene una lista de observadores y métodos para agregar observadores y notificarles un mensaje. La clase `Cliente` implementa la interfaz `Observador` y define cómo reacciona un cliente cuando recibe una notificación.


## Entrega 3: Patrones de Comportamiento
