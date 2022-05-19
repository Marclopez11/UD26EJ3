package com.example.ud26ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26ex3.dao.IVentaDAO;
import com.example.ud26ex3.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {
	
	
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		// TODO Auto-generated method stub
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		// TODO Auto-generated method stub
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);
		
	}

}
