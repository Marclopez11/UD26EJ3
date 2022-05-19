package com.example.ud26ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26ex3.dao.IMaquinaRegistradoraDAO;
import com.example.ud26ex3.dto.MaquinaRegistradora;

@Service
public class MaquinaServiceImpl implements IMaquinaService{
	
	@Autowired
	IMaquinaRegistradoraDAO iMaquinaDAO;


	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradora() {
		// TODO Auto-generated method stub
		return iMaquinaDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		// TODO Auto-generated method stub
		return iMaquinaDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora maquinaRegistradoraXID(int id) {
		// TODO Auto-generated method stub
		return iMaquinaDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		// TODO Auto-generated method stub
		return iMaquinaDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(int id) {
		iMaquinaDAO.deleteById(id);
		
	}

}
