/**
 * Clase: Componente
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.grupos;

// TODO: Auto-generated Javadoc
/**
 * la clase Componente.
 */
public class Componente {
	
	/** se crean los atributos privados. */
	private String nombre;

	private String instrumento;
	
	/**
	 * constructor vacío.
	 */
	public Componente() {
		
	}
	
	/**
	 * constructor por parámetros.
	 *
	 * @param nombre the nombre
	 * @param instrumento the instrumento
	 */
	public Componente(String nombre,String instrumento){
		this.nombre=nombre;
		this.instrumento=instrumento;
		
	}

	/**
	 *  getters y setters.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * establece el nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * recupera el instrumento.
	 *
	 * @return the instrumento
	 */
	public String getInstrumento() {
		return instrumento;
	}

	/**
	 * establece el instrumento.
	 *
	 * @param instrumento the new instrumento
	 */
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	/**
	 * método toString.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Componente: "+nombre+" a la "+instrumento;
	}
	
}
