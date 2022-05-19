package com.example.ud26ex3.service;

import java.util.List;

import com.example.ud26ex3.dto.Producto;

public interface IProductoService {
	
	public List<Producto> listarProducto(); 
	
	public Producto guardarProducto(Producto producto);	
	
	public Producto productoXID(int id); 
	
	public Producto actualizarProducto(Producto producto); 
	
	public void eliminarProducto(int id);

}
