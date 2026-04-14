/**
 * Clase: ApplicationContextTestXml
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.utils;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.entidades.Evento;
import com.accenture.servicios.GestionEventos;

// TODO: Auto-generated Javadoc
/**
 * la clase ApplicationContextTestXml.
 */
public class ApplicationContextTestXml {

    /**
     * el método main
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        /**
         *  se crea el contenedor de Spring
         */
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextXML.xml")){

        	/**
        	 *  se recupera el bean gestionEventos
        	 */
        	GestionEventos gestion = (GestionEventos) context.getBean("gestionEventos");

        	/**
        	 *  se obtiene la lista de eventos
        	 */
        	List<Evento> lista = gestion.getListaEventos();

        	/**
        	 *  recorrer e imprimir eventos por consola
        	 */
        	System.out.println("Listado de eventos");
        	System.out.println("------------------");
         	for (Evento e : lista) {
        		System.out.println(
        				e.getEventoId()+
        				" - "+
        				e.getNombre()+
        				" - "+
        				e.getDescripcion()+
        				" - "+
        				e.getLugar()+
        				" - "+
        				e.getDuracion()+
        				" - "+
        				e.getTipoEvento()+
        				" - "+
        				e.getAsientosDisp());

        	}
        
        }
        
    }
    
}