package com.example.ud26ex3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="maquinas_registradas")//en caso que la tabala sea diferente
public class MaquinaRegistradora {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;
	
	
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Venta> venta;


	
	public MaquinaRegistradora() {
		super();
		
	}

	public MaquinaRegistradora(int id, int piso, List<Venta> venta) {
		super();
		this.id = id;
		this.piso = piso;
		this.venta = venta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "MaquinaRegistradora [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}
	
	
	
	
	
	

	
	
	

}
