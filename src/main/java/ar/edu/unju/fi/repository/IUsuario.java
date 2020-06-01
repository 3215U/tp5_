/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author Benicio Roxana
 *
 */
public interface IUsuario {
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
	
	
}
