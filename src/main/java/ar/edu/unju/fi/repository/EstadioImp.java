/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Benicio Roxana
 *
 */
@Repository("/EstadioImp")
public class EstadioImp implements IEstadio {

	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto estadio en la BD
		LOG.info("El usuario fue guardado: " + estadio.getCiudad() +", "+estadio.getDireccion());
	}


	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto estadio de bd
		LOG.info("Se elimino el obeto estadio de bd");

	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		return estadio;
	}

}
