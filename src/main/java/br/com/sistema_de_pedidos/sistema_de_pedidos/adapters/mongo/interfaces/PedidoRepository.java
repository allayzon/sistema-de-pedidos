package br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.mongo.interfaces;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
