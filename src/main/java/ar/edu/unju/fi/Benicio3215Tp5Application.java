package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.ICuota;
import ar.edu.unju.fi.repository.IEstadio;
import ar.edu.unju.fi.repository.INoticia;
import ar.edu.unju.fi.repository.IResultado;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Benicio3215Tp5Application implements CommandLineRunner{

	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	
	@Autowired
	IEstadio estadioService;
	@Autowired
	Estadio estadio;
	
	@Autowired
	INoticia noticiaService;
	@Autowired
	Noticia noticia;
	
	@Autowired
	IResultado resultadoService;
	@Autowired
	Resultado resultado;
	
	@Autowired
	ICuota cuotaService;
	@Autowired
	Cuota cuota;
	
	public static void main(String[] args) {
		SpringApplication.run(Benicio3215Tp5Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// inicializacion de la varible d mi obeto usuario
		usuario.setApellido("Perez");
		usuario.setDireccion("Av. Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		//Equipo
		//no sirva
		equipo.setNombre("BOCA");
		equipo.setEstadio(estadio);
		
		equipoService.guardar();
		
		//Estadio
		estadio.setCiudad("CABA");
		estadio.setDireccion("Av. Pres. Figueroa Alcorta 7597, ");
		estadio.setCapacidad(70074);
		estadio.setFechaFundacion(LocalDate.of(1938,05,25));
		estadio.setNombre("RIVER");
		
		estadioService.guardar();
		
		//Noticia
		noticia.setTitulo("Partidos suspendidos");
		noticia.setResumen("Nueva noticia de los partidos suspendidos ppor la cuarentena...");
		noticia.setFecha(LocalDate.of(12, 02, 2020));
		
		noticiaService.guardar();
		
		//Resultado
		
		resultado.setFecha(LocalDate.of(2020, 06, 01));
		//falata algo
		resultado.setGolesEquipo1(3);
		
		resultadoService.guardar();
		
		//Cuota
		cuota.setEstado("PAGADO");
		cuota.setFechaPago(LocalDate.of(2020, 06, 01));
		cuota.setId(1);
		cuota.setMonto(3300.99);
		cuota.setPeriodo("6");
		cuota.setUsuario(usuario);
		
		cuotaService.guardar();
			
	}
}

