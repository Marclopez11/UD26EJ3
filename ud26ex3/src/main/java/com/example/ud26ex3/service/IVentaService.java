package com.example.ud26ex3.service;

import java.util.List;

import com.example.ud26ex3.dto.Venta;


public interface IVentaService {
	
	
	public List<Venta> listarVenta(); 
	
	public Venta guardarVenta(Venta venta);	
	
	public Venta ventaXID(int id); 
	
	public Venta actualizarVenta(Venta venta); 
	
	public void eliminarVenta(int id);

}
