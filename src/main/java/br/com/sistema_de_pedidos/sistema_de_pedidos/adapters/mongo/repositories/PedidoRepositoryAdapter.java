package br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.mongo.repositories;

import br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.mongo.interfaces.PedidoRepository;
import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import br.com.sistema_de_pedidos.sistema_de_pedidos.ports.PedidoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PedidoRepositoryAdapter implements PedidoRepositoryPort {

    private final PedidoRepository pedidoRepository;

    public PedidoRepositoryAdapter(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> findById(String id) {
        return pedidoRepository.findById(id);
    }
}
