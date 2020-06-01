/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Benicio Roxana
 *
 */
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto usuario en la BD
		LOG.info("El usuario fue guardado" + usuario.getApellido()+", "+usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos dle usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto usuario de bd
		LOG.info("Se elimino el usuario de bd");
	}

	@Override
	public Usuario modificar() {
		// 
		return usuario;
	}

}
