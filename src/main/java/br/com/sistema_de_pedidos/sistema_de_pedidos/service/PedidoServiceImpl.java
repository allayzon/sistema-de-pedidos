package br.com.sistema_de_pedidos.sistema_de_pedidos.service;

import br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.kafka.PedidoProducer;
import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.PedidoStatus;
import br.com.sistema_de_pedidos.sistema_de_pedidos.ports.PedidoRepositoryPort;
import br.com.sistema_de_pedidos.sistema_de_pedidos.ports.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoProducer pedidoProducer;
    private final PedidoRepositoryPort pedidoRepositoryPort;

    @Autowired
    public PedidoServiceImpl(PedidoProducer pedidoProducer,
                             PedidoRepositoryPort pedidoRepositoryPort) {
        this.pedidoProducer = pedidoProducer;
        this.pedidoRepositoryPort = pedidoRepositoryPort;
    }

    @Override
    public Pedido createPedido(Pedido pedido) {
        pedido.setStatusPedido(PedidoStatus.AGUARDANDO_ENVIO);
        Pedido savedPedido = pedidoRepositoryPort.save(pedido);
        pedidoProducer.sendPedido(savedPedido);
        return savedPedido;
    }

    @Override
    public Pedido getPedidoById(String id) {
        return pedidoRepositoryPort.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado."));
    }

    @Override
    public void updatePedidoStatus(String id, PedidoStatus status) {
        Pedido pedido = getPedidoById(id);
        pedido.setStatusPedido(status);
        pedidoRepositoryPort.save(pedido);
    }
}
