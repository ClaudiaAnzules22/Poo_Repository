package net.ug.hibernate.ug_hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aeropuerto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAeropuerto;
	
	private String nombres;
	
	private String ciudad;
	
	private String pais;
	
	private String aterrizajes;
	
	private String despegues;

	
	
	
	public Aeropuerto(long idAeropuerto, String nombres, String ciudad, String pais, String aterrizajes,
			String despegues) {
		
		this.idAeropuerto = idAeropuerto;
		this.nombres = nombres;
		this.ciudad = ciudad;
		this.pais = pais;
		this.aterrizajes = aterrizajes;
		this.despegues = despegues;
	}
	
	

	public Aeropuerto() {
		
	}



	public long getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAterrizajes() {
		return aterrizajes;
	}

	public void setAterrizajes(String aterrizajes) {
		this.aterrizajes = aterrizajes;
	}

	public String getDespegues() {
		return despegues;
	}

	public void setDespegues(String despegues) {
		this.despegues = despegues;
	}



	@Override
	public String toString() {
		return "Aeropuerto [idAeropuerto=" + idAeropuerto + ", nombres=" + nombres + ", ciudad=" + ciudad + ", pais="
				+ pais + ", aterrizajes=" + aterrizajes + ", despegues=" + despegues + "]";
	}
	
	
	
	
	
	
	
	
}

