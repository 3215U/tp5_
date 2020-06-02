/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;

/**
 * @author Benicio Roxana
 *
 */
public interface ICuotaService {
	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();

}
