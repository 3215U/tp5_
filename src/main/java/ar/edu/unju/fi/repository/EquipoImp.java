/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Benicio Roxana
 *
 */
@Repository("/EquipoImp")
public class EquipoImp implements IEquipo {

	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto equipo en la BD
		LOG.info("El usuario fue guardado: " +equipo.getEstadio()+", "+ equipo.getNombre());
	}



	@Override
	public Equipo mostrar() {
		// Se recuperan todos los datos del equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto equipo de bd
		LOG.info("Se elimino el equipo de bd");
	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		return equipo;
	}

}
