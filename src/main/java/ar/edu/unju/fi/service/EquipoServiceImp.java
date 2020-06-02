/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

/**
 * @author Benicio Roxana
 *
 */
@Repository
public class EquipoServiceImp implements IEquipoService {
	
	@Autowired
	private IEquipo iequipo;
	
	@Override
	public void guardar() {
		iequipo.guardar();

	}

	@Override
	public Equipo mostrar() {
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void eliminar() {
		iequipo.eliminar();

	}

	@Override
	public Equipo modificar() {
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
