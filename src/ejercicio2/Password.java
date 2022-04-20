package ejercicio2;

import java.util.Random;

/**
 * java-full-stack-dev-u08 - ejercicio2 - Password
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class Password {

	//Declaramos una constante con todos los caracteres para generar la contraseña aleatoria
	public static final String DIGITOS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private int longitud;
	private String contrasena;
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
	}

	// Contructor pasando la longitud de la contrasena con el propio metodo de clase
	// generar contraseña aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = this.generarContrasenaAleatoria(longitud);

	}

	//Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	//Metodo para generar contraseña aleatoria
	public String generarContrasenaAleatoria(int longitud) {

		String contrasena = "";

		for (int i = 0; i < longitud; i++) {

			contrasena += (DIGITOS.charAt((int) (Math.random() * DIGITOS.length())));

		}

		return contrasena;

	}
	
			
}
