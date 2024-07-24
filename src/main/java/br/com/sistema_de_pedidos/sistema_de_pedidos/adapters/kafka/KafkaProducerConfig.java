package br.com.sistema_de_pedidos.sistema_de_pedidos.adapters.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

public class KafkaProducerConfig {

    @Bean
    public ProducerFactory<String, Object> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();

    }
}
