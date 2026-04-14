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
	
	/** se crean los atributos. */
	private String nombre;
	
	private String instrumento;
	
	/**
	 * se crea el constructor vacío.
	 */
	public Componente() {
		
	}
	
	/**
	 * se crea el constructor por parámetros.
	 *
	 * @param nombre the nombre
	 * @param instrumento the instrumento
	 */
	public Componente(String nombre,String instrumento) {
		this.nombre=nombre;
		this.instrumento=instrumento;
	}

	/**
	 * recupera el nombre.
	 *
	 * @return el nombre
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
	 * @return el instrumento
	 */
	public String getInstrumento() {
		return instrumento;
	}

	/**
	 * establece el instrumento.
	 */
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	
	/**
	 * se crea el método toString.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Componente: "+nombre+" a la "+instrumento;
	}

}
