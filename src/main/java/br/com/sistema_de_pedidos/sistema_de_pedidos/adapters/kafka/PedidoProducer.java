package br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.kafka;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PedidoProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public PedidoProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendPedido(Pedido pedido) {
        kafkaTemplate.send("pedidos", pedido);
    }
}
