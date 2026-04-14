/**
 * Clase: UsoInyeccionDependencias
 * Autor: Javi
 * Fecha: 31/03/2026
 * 
 */
package com.accenture.grupos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO: Auto-generated Javadoc
/**
 * la clase UsoInyeccionDependencias.
 */
public class UsoInyeccionDependencias {

	/**
	 * el método main
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Se crea el contexto para el contenedor de Spring. Se usa try with resources para que cierre solo
		 */
		try(ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		/**
		 * Se crea la instancia de tipo Grupo cogiendo el bean del contenedor.
		 */
		Grupo grupo = contexto.getBean("grupo", Grupo.class);
		
		/**
		 * se imprime por consola
		 */
		System.out.println(grupo);

			/**
			 * se recorre para que coja los valores
			 */
			for (Componente c:grupo.getComponentes()) {
			System.out.println(c);

			}

		}
		
	}

}
