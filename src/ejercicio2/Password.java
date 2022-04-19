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

	public static final String DIGITOS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private int longitud;
	private String contrasena;
	
	public Password() {
		this.longitud = 8;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		
		String contrasena = "";
		
		for (int i = 0; i < longitud; i++) {
			
			contrasena += (DIGITOS.charAt((int)(Math.random() * DIGITOS.length())));
	
		}
		
		this.contrasena = contrasena;
		
	}

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
	
			
}
