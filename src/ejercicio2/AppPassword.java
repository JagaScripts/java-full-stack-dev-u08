/**
 * 
 */
package ejercicio2;

/**
 * java-full-stack-dev-u08 - ejercicio2 - AppPassword
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class AppPassword {

	public static void main(String[] args) {
		
		//Declaramos 2 objetos
		Password passDefecto = new Password();
		Password passGenerado = new Password(10);
		
		//Mostramos el funcionamiento
		System.out.println("Un constructor por defecto " + passDefecto.getLongitud());
		System.out.println("Un constructor con contraseña generada aleatoriamente " + passGenerado.getContrasena());

	}

}
