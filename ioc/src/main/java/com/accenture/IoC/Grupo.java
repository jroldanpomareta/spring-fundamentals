/**
 * Clase: Grupo
 * Autor: Javi
 * Fecha: 31/03/2026
 * Descripción: Representa un grupo musical con sus datos básicos.
 */

package com.accenture.IoC;

// TODO: Auto-generated Javadoc
/**
 * Se crea la clase Grupo.
 */
public class Grupo {
	
	/** Se crean los atributos privados. */
	private int id;
	
	/** nombre del grupo */
	private String nombre;
	
	/** creación del grupo */
	private int creacion;

	/** el origen del grupo */
	private String origen;
	
	/** género musical del grupo */
	private String genero;

	/**
	 * Se crean los getters y setters.
	 *
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets la creacion
	 *
	 * @return la creacion
	 */
	public int getCreacion() {
		return creacion;
	}

	/**
	 * Establece la creacion
	 */
	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}

	/**
	 * Gets el origen
	 *
	 * @return el origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Establece el origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Gets el genero
	 *
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Establece el genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Se crea el método toString.
	 *
	 * @return el string
	 */
	@Override
	public String toString() {
	    return nombre + " - " + origen + " " + creacion + " - " + genero;
	}
	
}
