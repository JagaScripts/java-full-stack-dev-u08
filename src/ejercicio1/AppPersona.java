/**
 * 
 */
package ejercicio1;

/**
 * java-full-stack-dev-u08 - ejercicio1 - AppPersona
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 * 
 */
public class AppPersona {

	public static void main(String[] args) {
		
		Persona personaDefecto = new Persona();
		Persona personaTres = new Persona("Jose",39,'H');
		Persona personaTodos = new Persona("Jose",39,"231255665B",'H',85,(float)1.85);
		
		System.out.println(personaDefecto.getNombre() + " " + personaDefecto.getSexo());
		System.out.println(personaTres.getNombre());
		System.out.println(personaTodos.getPeso() + " " + personaTodos.getAltura());

	}

}
