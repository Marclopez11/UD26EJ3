package com.example.ud26ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud26ex3.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}