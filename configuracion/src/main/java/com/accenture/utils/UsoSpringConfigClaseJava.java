/**
 * Clase: UsoSpringConfigClaseJava
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.utils;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.accenture.entidades.Evento;
import com.accenture.entidades.EventosConfig;
import com.accenture.servicios.GestionEventos;

// TODO: Auto-generated Javadoc
/**
 * la clase UsoSpringConfigClaseJava.
 */
public class UsoSpringConfigClaseJava {

    /**
     * el método main
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

    	/**
    	 * se crea el contenedor para gestionar los beans y se usa EventosConfig
    	 */
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventosConfig.class)) {

        	/**
        	 * se obtiene el bean del contenedor
        	 */
            GestionEventos gestion = context.getBean(GestionEventos.class);

            /**
             * se obeiene la lista de los eventos
             */
            List<Evento> lista = gestion.getListaEventos();

            /**
             * se imprime
             */
            System.out.println("Listado de eventos");
            System.out.println("------------------");

            /**
             * se recorre para que salgan todos los datos
             */
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