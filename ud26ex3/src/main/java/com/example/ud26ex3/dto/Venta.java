package com.example.ud26ex3.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta") // en caso que la tabala sea diferente
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajero cajero;
	
	@ManyToOne
    @JoinColumn(name = "maquina")
    MaquinaRegistradora maquina;
	
	
	@ManyToOne
    @JoinColumn(name = "producto")
    Producto producto;

	
	
	
	public Venta() {
		super();
		
	}

	public Venta(int id, Cajero cajero, MaquinaRegistradora maquina, Producto producto) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaRegistradora maquina) {
		this.maquina = maquina;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}
	
	
	
	
	
	
	

}
