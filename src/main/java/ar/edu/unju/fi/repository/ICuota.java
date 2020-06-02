/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

/**
 * @author Bencio Roxana
 *
 */
public interface ICuota {
	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();
	
	

}
