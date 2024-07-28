package br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.kafka;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.PedidoStatus;
import br.com.sistema_de_pedidos.sistema_de_pedidos.ports.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoConsumer(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @KafkaListener(topics = "pedidos", groupId = "pedido_group")
    public void consumePedido(Pedido pedido) {
        pedidoService.updatePedidoStatus(pedido.getIdPedido(), PedidoStatus.ENVIADO_TRANSPORTADORA);
    }
}
