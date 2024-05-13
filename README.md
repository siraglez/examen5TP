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

### 2. Adapter:

### 3. Observer:

## Entrega 3: Patrones de Comportamiento
