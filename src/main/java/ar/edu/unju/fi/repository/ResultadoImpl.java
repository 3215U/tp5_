package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * @author Benicio Roxana
 *
 */
@Repository("/resultadoImp")
public class ResultadoImpl implements IResultado {

	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto resultado en la BD
		LOG.info("El resultado fue guardado: " + resultado.getEquipo1()+", "+ resultado.getGolesEquipo1()+" VS " + resultado.getEquipo2()+", "+ resultado.getGolesEquipo2());
	
	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos del resultado
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto resultado de bd
		LOG.info("Se elimino el resultado de bd");

	}

	@Override
	public Resultado modificar() {
		return resultado;
	}

}
