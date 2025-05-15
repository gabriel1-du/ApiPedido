package com.example.ApiPedido.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiPedido.Model.Pedido;
import com.example.ApiPedido.Repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired //Inyeccion de repo
    private PedidoRepository pedidoRepository; //Objeto del repo

    //Metodos

    //MOSTRAR TODOS los pedidos
     public List<Pedido> getAll() {
        return pedidoRepository.findAll(); // Devuelve lista de personas
    }


    //BUSCAR por ID
    public Pedido getById(Integer id_pedido) {
        Optional<Pedido> persona = pedidoRepository.findById(id_pedido); 
        return persona.orElse(null); 
    }


    //CREAR un nuevo pedido
    public Pedido add(Pedido pedido) {   
        return pedidoRepository.save(pedido); // Guarda y retorna UN NUEVO PEDIDO
    }


    // ACTUALIZAR UN PEDIDO EXISTENTE(Se presento un error en esta mielda)
    public Pedido update(Integer id_pedido, Pedido pedido) {
        if (pedidoRepository.existsById(id_pedido)) {
            pedido.setId(id_pedido); // Aseguramos que se use el mismo ID
            return pedidoRepository.save(pedido); // Guarda los cambios
        }
        return null; // No se encontró EL PEDIDO
    }



}   
