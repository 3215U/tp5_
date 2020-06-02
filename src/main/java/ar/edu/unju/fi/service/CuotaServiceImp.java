/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

/**
 * @author Benicio Roxana
 *
 */
@Repository
public class CuotaServiceImp implements ICuotaService {

	@Autowired	
	private ICuota icuota;
	
	@Override
	public void guardar() {
		icuota.guardar();

	}

	@Override
	public Cuota mostrar() {
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	@Override
	public void eliminar() {
		icuota.eliminar();
	}

	@Override
	public Cuota modificar() {
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
