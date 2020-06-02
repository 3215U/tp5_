/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * @author Benicio  Roxana
 *
 */
@Repository
public class NoticiaServiceImp implements INoticiaService {

	@Autowired
	private INoticia inoticia;
	
	@Override
	public void guardar() {
		inoticia.guardar();
	}

	@Override
	public Noticia mostrar() {
		Noticia noticia= inoticia.mostrar();
		return noticia;
	}

	@Override
	public void eliminar() {
		inoticia.eliminar();
	}

	@Override
	public Noticia modificar() {
		Noticia noticia= inoticia.modificar();
		return noticia;
	}

}
