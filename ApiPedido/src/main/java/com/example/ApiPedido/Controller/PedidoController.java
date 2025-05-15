package com.example.ApiPedido.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPedido.Model.Pedido;
import com.example.ApiPedido.Service.PedidoService;

@RestController
@RequestMapping("api/pedido")
public class PedidoController {

    @Autowired //Inyeccion del ser
    private PedidoService pedidoService;


    //TENER A todos los pedidoS
    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getAll() {
        return ResponseEntity.ok(pedidoService.getAll());
    }


    //BUSCAR por id 
    @GetMapping("/{id_pedido}")
    public ResponseEntity<?> getById(@PathVariable Integer id_pedido) {
        Pedido pedido = pedidoService.getById(id_pedido);
        if (pedido != null) {
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido no encontrado");
        }
    }

    //CREAR un nuevo pedido (POST)
    @PostMapping
    public ResponseEntity<?> add(@RequestBody Pedido pedido) {
        Pedido nuevoPedido = pedidoService.add(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPedido);
    }

    //ACTUALIZAR pedido
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id_pedido, @RequestBody Pedido pedido) {
        Pedido actualizado = pedidoService.update(id_pedido, pedido);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido no encontrado");
        }
    }





}
