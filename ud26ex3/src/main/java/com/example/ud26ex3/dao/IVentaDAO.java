package com.example.ud26ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud26ex3.dto.Venta;


public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
