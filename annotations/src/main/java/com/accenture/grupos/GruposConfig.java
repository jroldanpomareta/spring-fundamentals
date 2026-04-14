/**
 * Clase: GruposConfig
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.grupos;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// TODO: Auto-generated Javadoc
/**
 * esto reemplaza el XML de configuración.
 */
@Configuration
public class GruposConfig {

	/**
	 *  se crean los 4 beans.
	 *
	 * @return the componente
	 */
	@Bean
	public Componente jamesHetfield() {
	    return new Componente("James Hetfield", "Voz");
	}
	
	/**
	 * Kirk hammett.
	 *
	 * @return the componente
	 */
	@Bean
	public Componente kirkHammett() {
	    return new Componente("Kirk Hammett", "Guitarra");
	}
	
	/**
	 * Cliff burton.
	 *
	 * @return the componente
	 */
	@Bean
	public Componente cliffBurton() {
	    return new Componente("Cliff Burton", "Bajo");
	}

	/**
	 * Lars ulrich.
	 *
	 * @return the componente
	 */
	@Bean
	public Componente larsUlrich() {
	    return new Componente("Lars Ulrich", "Bateria");
	}
	
	/**
	 * se crea el bean de la clase grupo y en él se inyectan los otros.
	 *
	 * @return the grupo
	 */
	@Bean
	public Grupo metallica() {

	    List<Componente> componentes = List.of(
	        jamesHetfield(),
	        kirkHammett(),
	        cliffBurton(),
	        larsUlrich()
	    );

	    return new Grupo(
	        "Metallica",
	        1981,
	        "Estados Unidos",
	        "Heavy Metal",
	        componentes
	    );
	    
	}
	
}