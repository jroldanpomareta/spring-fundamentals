package com.accenture.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO: Auto-generated Javadoc
/**
 * La Clase UsoInversionControl.
 */
public class UsoInversionControl {

	/**
	 * El método main
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Se crea el contexto para el contenedor de Spring. Se usa try with resources para que cierre solo
		 */
		try(ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		/**
		 * Se crea la instancia de tipo Grupo cogiendo el bean del contenedor.
		 */
		Grupo grupo=contexto.getBean("grupo",Grupo.class);
		
		/**
		 * Se dan valores a los atributos de la instancia - Al final no lo usé porque dijiste en la clase que lo
		 * hicieramos con property
		 */
		grupo.setNombre("Metallica");
		grupo.setOrigen("Estados Unidos");
		grupo.setCreacion(1981);
		grupo.setGenero("Heavy Metal");
		
		//Se imprime por consola
		System.out.println(grupo);

		/**
		 * context.close(); al final no se usa porque lo hago con try with resources para que cierre solo
		 */
	
		}
		
	}

}

/**
 *  Lo hice primero sin Maven pero me dió error porque pedía para compilar que estuviera
 *  marcado "Download repository index updates on startup", estuve investigando y por lo que he visto
 *  es porque eclipse usa Maven por debajo aunque yo no lo esté usando, conseguí que funcionara marcándolo
 *  y como dijiste el clase que se podía hacer con Maven pues ya aproveché y como se tarda poco en este
 *  ejercicio pues lo hice de nuevo ya también con Maven directo sin meter las dependencias.
 */
