package com.example.ApiPedido.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Falta Entity y Table
public class Direccion {


    //Atributos
    private int id_direccion;
    private String comuna;
    private String region;

    @ManyToOne
    @JsonBackReference  //Dependencia con pedido
    @JoinColumn(name = "Pedido")
    private List<Pedido> pedido;

}
