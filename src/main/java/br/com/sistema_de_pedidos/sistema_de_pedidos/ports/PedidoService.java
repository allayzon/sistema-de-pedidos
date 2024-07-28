package br.com.sistema_de_pedidos.sistema_de_pedidos.ports;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.PedidoStatus;

public interface PedidoService {

    Pedido createPedido(Pedido pedido);

    Pedido getPedidoById(String id);

    void updatePedidoStatus(String id, PedidoStatus status);

}
