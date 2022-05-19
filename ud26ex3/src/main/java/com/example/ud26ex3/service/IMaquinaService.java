package com.example.ud26ex3.service;

import java.util.List;

import com.example.ud26ex3.dto.MaquinaRegistradora;

public interface IMaquinaService {
	
	public List<MaquinaRegistradora> listarMaquinaRegistradora(); 
	
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);	
	
	public MaquinaRegistradora maquinaRegistradoraXID(int id); 
	
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora); 
	
	public void eliminarMaquinaRegistradora(int id);

}
