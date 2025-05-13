package com.example.ApiPedido.Model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Falta Entity y Table
public class Pedido {
    

    //Atributos
    private int id_pedido;
    
    //Dependencia con direccion
    @OneToMany(mappedBy = "Direccion", cascade = CascadeType.ALL, orphanRemoval = true) 
    private List<Direccion> direcciones;
    //Dependencia con producto
    @OneToMany(mappedBy = "Producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;
    //Dependencia con usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;



    


}
