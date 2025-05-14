package com.example.ApiPedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPedido.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
