package br.com.sistema_de_pedidos.sistema_de_pedidos.domain;

public class Pedido {

    private String idPedido;
    private int numeroPedido;
    private PedidoStatus statusPedido;

    public Pedido() {
    }

    public Pedido(String idPedido, int numeroPedido, PedidoStatus statusPedido) {
        this.idPedido = idPedido;
        this.numeroPedido = numeroPedido;
        this.statusPedido = statusPedido;
    }

    public Pedido(int numeroPedido, PedidoStatus statusPedido) {
        this.numeroPedido = numeroPedido;
        this.statusPedido = statusPedido;
    }
}
