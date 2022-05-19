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

import com.example.ud26ex3.dto.MaquinaRegistradora;
import com.example.ud26ex3.service.MaquinaServiceImpl;



@RestController
@RequestMapping("/api")
public class MaquinaController {
	
	@Autowired
	MaquinaServiceImpl maquinaServiceImpl;
	
	@GetMapping("/maquinas")
	public List<MaquinaRegistradora> listarMaquinas(){
		return maquinaServiceImpl.listarMaquinaRegistradora();
	}
	
	
	@PostMapping("/maquinas")
	public MaquinaRegistradora salvarMaquina(@RequestBody MaquinaRegistradora maquina) {
		
		return maquinaServiceImpl.guardarMaquinaRegistradora(maquina);
	}
	
	
	@GetMapping("/maquinas/{id}")
	public MaquinaRegistradora maquinaXID(@PathVariable(name="id") int id) {
		
		MaquinaRegistradora Maquina_xid= new MaquinaRegistradora();
		
		Maquina_xid=maquinaServiceImpl.maquinaRegistradoraXID(id);
		
		System.out.println("Maquina XID: "+Maquina_xid);
		
		return Maquina_xid;
	}
	
	@PutMapping("/maquinas/{id}")
	public MaquinaRegistradora actualizarMaquina(@PathVariable(name="id")int id,@RequestBody MaquinaRegistradora maquina) {
		
		MaquinaRegistradora Maquina_seleccionado= new MaquinaRegistradora();
		MaquinaRegistradora Maquina_actualizado= new MaquinaRegistradora();
		
		Maquina_seleccionado= maquinaServiceImpl.maquinaRegistradoraXID(id);
		
		Maquina_seleccionado.setPiso(maquina.getPiso());
		
		Maquina_actualizado = maquinaServiceImpl.actualizarMaquinaRegistradora(Maquina_seleccionado);
		
		System.out.println("La maquina actualizado es: "+ Maquina_actualizado);
		
		return Maquina_actualizado;
	}
	
	@DeleteMapping("/maquinas/{id}")
	public void eleiminarMaquina(@PathVariable(name="id")int id) {
		maquinaServiceImpl.eliminarMaquinaRegistradora(id);
	}

}
