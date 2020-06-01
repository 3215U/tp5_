/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Benicio Roxana
 *
 */
@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
	
	//Constructor 
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	//Constructor 
	/**
	 * @param estadio
	 */
	@Autowired
	public Equipo(Estadio estadio) {
		super();
		this.estadio = estadio;
	}

	//Getter and Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}


	//ToString
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}
