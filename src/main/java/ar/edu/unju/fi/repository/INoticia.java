/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

/**
 * @author ssd
 *
 */
public interface INoticia {
	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();
	
	
}
