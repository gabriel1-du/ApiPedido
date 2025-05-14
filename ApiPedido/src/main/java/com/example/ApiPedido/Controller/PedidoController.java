package com.example.ApiPedido.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPedido.Model.Pedido;
import com.example.ApiPedido.Service.PedidoService;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {

    @Autowired //Inyeccion del ser
    private PedidoService pedidoService;


    //Obtencion de todos los pedidoS
    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getAll() {
        return ResponseEntity.ok(pedidoService.getAll());
    }

}
