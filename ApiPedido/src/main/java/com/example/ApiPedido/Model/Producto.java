package com.example.ApiPedido.Model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {

    private int id_producto;
    private int precio;
    private String nombre;

    //Crear dependencia de tabla con pedido
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

}
