/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * @author Benicio Roxana
 *
 */
@Repository
public class ResultadoServiceImp implements IResultadoService {

	@Autowired
	private IResultado iresultado;
	
	
	
	@Override
	public void guardar() {
		iresultado.guardar();
	}

	@Override
	public Resultado mostrar() {
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}

	@Override
	public void eliminar() {
		iresultado.eliminar();
	}

	@Override
	public Resultado modificar() {
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
