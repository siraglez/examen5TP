package ejercicio1.entrega3;

public class Mediator {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    public Mediator(Cocina cocina, ServicioCliente servicioCliente, Entrega entrega) {
        this.cocina = cocina;
        this.servicioCliente = servicioCliente;
        this.entrega = entrega;
    }

    public void ejecutarPedido() {
        cocina.prepararPedido();
        servicioCliente.servirPedido();
        entrega.entregarPedido();
    }
}
