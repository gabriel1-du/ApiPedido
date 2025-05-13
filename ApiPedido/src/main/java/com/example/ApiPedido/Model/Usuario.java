package com.example.ApiPedido.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Poner que es entity y ademas que es una tabla
public class Usuario {


    //Atributos de usuario

    private int id_usuario;
    private String nombre;


    //Crear dependencia con pedido
    @OneToMany(mappedBy = "Pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;
}
