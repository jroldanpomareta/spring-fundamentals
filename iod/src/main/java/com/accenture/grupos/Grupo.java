/**
 * Clase: Grupo
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.grupos;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * la clase Grupo.
 */
public class Grupo {
	
	/** se crean los atributos. */
	private String nombre;
	
	private int creacion;
	
	private String origen;
	
	private String  genero;
	
	private List<Componente>componentes;
	
	/**
	 * se crea el constructor vacío.
	 */
	public Grupo() {
		
	}
	
	/**
	 * Instancias a nuevo grupo.
	 *
	 * @param nombre the nombre
	 * @param creacion the creacion
	 * @param origen the origen
	 * @param genero the genero
	 * @param componentes the componentes
	 */
	//se crea el constructor por parámetros
	public Grupo(String nombre,int creacion,String origen,String genero,List<Componente>componentes) {
		this.nombre=nombre;
		this.creacion=creacion;
		this.origen=origen;
		this.genero=genero;
		this.componentes=componentes;
	}

	/**
	 * se crean los getters y setters.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * establece the nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * recupera la creacion.
	 *
	 * @return the creacion
	 */
	public int getCreacion() {
		return creacion;
	}

	/**
	 * establece la creacion.
	 *
	 * @param creacion the new creacion
	 */
	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}

	/**
	 * recupera el origen.
	 *
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * establece el origen.
	 *
	 * @param origen the new origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * recupera el genero.
	 *
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * establece el genero.
	 *
	 * @param genero the new genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * recupera los componentes.
	 *
	 * @return the componentes
	 */
	public List<Componente> getComponentes() {
		return componentes;
	}

	/**
	 * establece los componentes.
	 *
	 * @param componentes the new componentes
	 */
	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	/**
	 * se crea el método toString.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return nombre +" - " +origen+" "+creacion+" - "+genero;
	}

}
