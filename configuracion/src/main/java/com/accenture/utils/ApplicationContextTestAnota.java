/**
 * Clase: ApplicationContextTestAnota
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
 * la clase ApplicationContextTestAnota.
 */
public class ApplicationContextTestAnota {

    /**
     * el método main
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){

        GestionEventos gestion = context.getBean(GestionEventos.class);

        List<Evento> lista = gestion.getListaEventos();

        System.out.println("Listado de eventos");
        System.out.println("------------------");

        	for (Evento e : lista) {
        		System.out.println(
        			e.getEventoId() + " - " +
	                e.getNombre() + " - " +
	                e.getDescripcion() + " - " +
	                e.getLugar() + " - " +
	                e.getDuracion() + " - " +
	                e.getTipoEvento() + " - " +
	                e.getAsientosDisp()
        			);
        	}
        	
        }
        
    }
    
}