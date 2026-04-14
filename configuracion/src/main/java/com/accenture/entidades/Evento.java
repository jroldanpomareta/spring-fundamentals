/**
 * Clase: Evento
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.entidades;

// TODO: Auto-generated Javadoc
/**
 * la clase Evento.
 */
public class Evento {
	
	/** los atributos privados. */
	private int eventoId;
	
	private String nombre;
	
	private String descripcion;
	
	private String lugar;
	
	private String duracion;
	
	private String tipoEvento;
	
	private int asientosDisp;
	
	/**
	 * constructor vacío.
	 */
	public Evento() {
		
	}
	
	/**
	 * constructor por parámetros.
	 */
	public Evento(int eventoId,String nombre,String descripcion,String lugar,String duracion,String tipoEvento,int asientosDisp) {
		this.eventoId=eventoId;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.lugar=lugar;
		this.duracion=duracion;
		this.tipoEvento=tipoEvento;
		this.asientosDisp=asientosDisp;
	}
	
	/**
	 * se crean los getters y setters.
	 *
	 * @return el evento id
	 */
	public int getEventoId() {
		return eventoId;
	}

	/**
	 * establece el evento id.
	 *
	 * @param eventoId the new evento id
	 */
	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
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
	 * establece nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * recupera la descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * establece la descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * recupera el lugar.
	 *
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * establece el lugar.
	 *
	 * @param lugar the new lugar
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * recupera la duracion.
	 *
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * establece la duracion.
	 *
	 * @param duracion the new duracion
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * recupera el tipo evento.
	 *
	 * @return the tipo evento
	 */
	public String getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * establece el tipo evento.
	 *
	 * @param tipoEvento the new tipo evento
	 */
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * recupera los asientos disp.
	 *
	 * @return the asientos disp
	 */
	public int getAsientosDisp() {
		return asientosDisp;
	}

	/**
	 * establece los asientos disp.
	 *
	 * @param asientosDisp the new asientos disp
	 */
	public void setAsientosDisp(int asientosDisp) {
		this.asientosDisp = asientosDisp;
	}

	/**
	 * método toString.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
	    return "Evento [id="+
	    		eventoId+
	           ", nombre="+
	           	nombre+
	           ", descripcion="+
	           	descripcion+
	           ", lugar="+
	           	lugar+
	           	", duracion="+
	           	duracion+
	           ", tipoEvento="+
	           	tipoEvento+
	           ", asientos="+
	           	asientosDisp+
	           	"]";
	}

}
