/**
 * Clase: EventosConfig
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.entidades;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// TODO: Auto-generated Javadoc
/**
 * con esta annotation se sustituye al xml.
 */
@Configuration
@ComponentScan("com.accenture")//con esta annotation se buscan las annotations que haya
public class EventosConfig {

	/**
	 * se crean los beans.
	 *
	 * @return el evento
	 */
    @Bean
    public Evento evento1() {
        return new Evento(1,"Concierto Metallica","World Tour 2024","Madrid","3 horas","Musica",67);
    }

    /**
     * Evento 2.
     *
     * @return the evento
     */
    @Bean
    public Evento evento2() {
        return new Evento(2,"Concierto ACDC","Hellfest 2024","Francia","3 horas","Musica",130);
    }

    /**
     * Evento 3.
     *
     * @return the evento
     */
    @Bean
    public Evento evento3() {
        return new Evento(3,"Concierto Iron Maiden","World Tour 2024","Australia","2 horas","Musica",310);
    }

}