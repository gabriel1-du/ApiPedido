package com.example.ApiPedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPedido.Model.Pedido;

public interface ItemPedidoRepository extends JpaRepository<Pedido, Integer>{

}
