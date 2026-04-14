/**
 * Clase: UsoSpringConfigClaseJava
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.grupos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// TODO: Auto-generated Javadoc
/**
 * la clase UsoSpringConfigClaseJava.
 */
public class UsoSpringConfigClaseJava {

	/**
	 * el método main.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * se crea el contenedor de Spring y se carga la configuración definida en GruposConfig
		 */
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GruposConfig.class)){
	      
	      /**
	       * aquí se pide el bean metallica al contenedor
	       */
	      Grupo grupo = context.getBean("metallica", Grupo.class);
	      
	      System.out.println(grupo);
	      
	      /**
	       * aquí se recorre la lista de componentes del grupo
	       */
	      for (Componente c : grupo.getComponentes()) {
	          System.out.println(c);
	      }}
	      
	      /**
	       * context.close(); // no se usa porque se cierra con try with resources
	       */

	}

}
