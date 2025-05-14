package com.example.ApiPedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPedido.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
