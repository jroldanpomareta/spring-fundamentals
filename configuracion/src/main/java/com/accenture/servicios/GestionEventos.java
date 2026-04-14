/**
 * Clase: GestionEventos
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.servicios;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

import com.accenture.entidades.Evento;

// TODO: Auto-generated Javadoc
/**
 * esta annotation le dice a Spring que es un bean y lo cree.
 */
@Component
public class GestionEventos {
	
	/** atributos y se importa desde el otro paquete Evento y se pone privado porque dijiste que es buena práctica. */
	@Inject //esta annotation inyecta los eventos que haya, he puesto @Inyect en vez de @Autowired porque dijiste que era buena práctica
	private List<Evento>listaEventos;
	
	/**
	 * getter y setter.
	 *
	 * @return la lista eventos
	 */
	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	/**
	 * establece la lista eventos.
	 *
	 * @param listaEventos the new lista eventos
	 */
	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}
	
}
