package com.example.ApiPedido.Model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//Falta  Table
public class Pedido {
    

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido;
    

    //Dependencia con direccion
    @OneToMany(mappedBy = "Pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Direccion> direcciones;


    //Dependencia con producto
    @OneToMany(mappedBy = "Producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> pedidos;


    //Dependencia con usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
