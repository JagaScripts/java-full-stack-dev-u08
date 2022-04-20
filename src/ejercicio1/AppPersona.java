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
		
		// Declaramos 3 Objetos personas uno por defecto otro con solo tres parametros y
		// otro con todos los atributos por parametro
		Persona personaDefecto = new Persona();
		Persona personaTres = new Persona("Jose",39,'H');
		Persona personaTodos = new Persona("Jose",39,"231255665B",'H',85,(float)1.85);
		
		//Mostramos los objetos con algunos atributos relevantes
		System.out.println("Nombre " + personaDefecto.getNombre() + " Sexo " + personaDefecto.getSexo() + " Altura " + personaDefecto.getAltura() + " Peso " + personaDefecto.getPeso() + " DNI " + personaDefecto.getDni());
		System.out.println("Nombre " + personaTres.getNombre() + " Sexo " + personaTres.getSexo() + " Altura " + personaTres.getAltura() + " Peso " + personaTres.getPeso() + " DNI " + personaTres.getDni());
		System.out.println("Nombre " + personaTodos.getNombre() + " Sexo " + personaTodos.getSexo() + " Altura " + personaTodos.getAltura() + " Peso " + personaTodos.getPeso() + " DNI " + personaTodos.getDni());
	

	}

}
