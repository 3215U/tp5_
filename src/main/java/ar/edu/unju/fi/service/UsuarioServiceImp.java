/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

/**
 * @author Benicio Roxana
 *
 */
@Repository
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	private IUsuario iusuario;
	
	@Override
	public void guardar() {
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}

	
	@Override
	public void eliminar() {
		iusuario.eliminar();
	}

	@Override
	public Usuario modificar() {
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
