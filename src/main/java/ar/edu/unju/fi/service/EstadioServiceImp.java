/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;

/**
 * @author Benicio Roxana
 *
 */
@Repository
public class EstadioServiceImp implements IEstadioService {

	@Autowired
	private IEstadio iestadio;
	
	@Override
	public void guardar() {
		iestadio.guardar();
	}

	@Override
	public Estadio mostrar() {
		Estadio estadio = iestadio.mostrar();
		return estadio;
	}

	@Override
	public void eliminar() {
		iestadio.eliminar();
	}

	@Override
	public Estadio modificar() {
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
