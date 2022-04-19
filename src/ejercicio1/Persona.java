package ejercicio1;

/**
 * java-full-stack-dev-u08 - ejercici1 - Persona
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class Persona {

	//Atributos de clase con modifcador de acceso private para que no accedaddirectamenta a ellos
	public static final char H = 'H';
	public static final char M = 'M';
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private float peso;
	private float altura;

	//Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.altura = (float) 0.0;
		this.edad = 0;
		this.peso = (float) 0.0;
		this.sexo = H;
	}
	
	//Constructor con el nombre, edad y sexo, el resto por defecto
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	//Constructor con todos los atributos
	public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
