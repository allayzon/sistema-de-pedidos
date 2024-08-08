package br.com.sistema_de_pedidos.sistema_de_pedidos.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pedidos")
public class Pedido {

    @Id
    private String idPedido;
    private PedidoStatus statusPedido;

    public Pedido() {
    }

    public Pedido(String idPedido, PedidoStatus statusPedido) {
        this.idPedido = idPedido;
        this.statusPedido = statusPedido;
    }

    public Pedido(PedidoStatus statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getIdPedido() { return idPedido; }

    public PedidoStatus getStatusPedido() { return statusPedido; }

    public void setStatusPedido(PedidoStatus pedidoStatus) { this.statusPedido = pedidoStatus; }
}
