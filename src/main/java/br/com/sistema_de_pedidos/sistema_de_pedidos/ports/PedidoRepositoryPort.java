package br.com.sistema_de_pedidos.sistema_de_pedidos.ports;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;

import java.util.Optional;

public interface PedidoRepositoryPort {
    void save(Pedido pedido);

    Optional<Pedido> findById(String id);
}
