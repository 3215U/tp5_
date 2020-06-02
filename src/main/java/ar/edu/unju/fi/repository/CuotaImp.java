/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * @author Benicio Roxana
 *
 */
@Repository("/cuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto usuario en la BD
		LOG.info("La cuota fue guarda: "+cuota.getPeriodo()+", "+cuota.getMonto());
	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino la cuota de bd");
	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		return cuota;
	}

}
