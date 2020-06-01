/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author Benicio Roxana
 *
 */
public interface IUsuarioService {

	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

	
}
