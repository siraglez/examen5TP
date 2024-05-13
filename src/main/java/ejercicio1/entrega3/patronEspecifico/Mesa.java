package ejercicio1.entrega3.patronEspecifico;

public class Mesa {
    private EstadoMesa estado;

    public Mesa() {
        estado = new MesaLibre();
    }

    public void cambiarEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public void solicitar() {
        estado.solicitar(this);
    }

    public void ocupar() {
        estado.ocupar(this);
    }

    public void liberar() {
        estado.liberar(this);
    }
}
