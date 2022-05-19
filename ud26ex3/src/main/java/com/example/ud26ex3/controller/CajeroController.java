package com.example.ud26ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ud26ex3.dto.Cajero;
import com.example.ud26ex3.service.CajeroServiceImpl;


@RestController
@RequestMapping("/api")
public class CajeroController {
	
	
	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajero(){
		return cajeroServiceImpl.listarCajero();
	}
	
	
	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/cajeros/{id}")
	public Cajero cajeroXID(@PathVariable(name="id") int id) {
		
		Cajero Cajero_xid= new Cajero();
		
		Cajero_xid=cajeroServiceImpl.cajeroXID(id);
		
		System.out.println("Cajero XID: "+Cajero_xid);
		
		return Cajero_xid;
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name="id")int id,@RequestBody Cajero cajero) {
		
		Cajero Cajero_seleccionado= new Cajero();
		Cajero Cajero_actualizado= new Cajero();
		
		Cajero_seleccionado= cajeroServiceImpl.cajeroXID(id);
		
		Cajero_seleccionado.setNombre(cajero.getNombre());
		
		Cajero_actualizado = cajeroServiceImpl.actualizarCajero(Cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ Cajero_actualizado);
		
		return Cajero_actualizado;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eleiminarCajero(@PathVariable(name="id")int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}

}
