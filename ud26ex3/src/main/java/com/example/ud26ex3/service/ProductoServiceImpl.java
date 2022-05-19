package com.example.ud26ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26ex3.dao.IProductoDAO;
import com.example.ud26ex3.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return iProductoDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto productoXID(int id) {
		// TODO Auto-generated method stub
		return iProductoDAO.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		iProductoDAO.deleteById(id);
		
	}

}
