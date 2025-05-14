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
     public List<Pedido> getAll() {
        return pedidoRepository.findAll(); // Devuelve lista de personas
    }



    //Buscar para ID
    public Pedido getById(Integer id) {
        Optional<Pedido> persona = pedidoRepository.findById(id); 
        return persona.orElse(null); 
    }


}
