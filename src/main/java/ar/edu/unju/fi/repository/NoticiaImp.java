
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Noticia;


/**
 * @author Benicio Roxana
 *
 */
@Repository("/NoticiaImp")
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto noticia en la BD
		LOG.info("El usuario fue guardado: " + noticia.getTitulo());
	}


	@Override
	public Noticia mostrar() {
		// Se recuperan todos los datos de noticia
		LOG.info("Mostrar los datos noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimino el obeto noticia de bd
		LOG.info("Se elimino la noticia de bd");
	}

	@Override
	public Noticia modificar() {
		// TODO Auto-generated method stub
		return noticia;
	}

}
