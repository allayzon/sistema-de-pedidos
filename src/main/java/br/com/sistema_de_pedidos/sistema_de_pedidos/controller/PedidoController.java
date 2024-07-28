package br.com.sistema_de_pedidos.sistema_de_pedidos.controller;

import br.com.sistema_de_pedidos.sistema_de_pedidos.domain.Pedido;
import br.com.sistema_de_pedidos.sistema_de_pedidos.ports.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.createPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(String id) {
        return pedidoService.getPedidoById(id);
    }
}
