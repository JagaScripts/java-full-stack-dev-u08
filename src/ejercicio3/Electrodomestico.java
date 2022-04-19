package ejercicio3;

/**
 * java-full-stack-dev-u08 - ejercicio3 - Electrodomestico
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class Electrodomestico {

	public static final char A = 'A';
	public static final char F = 'F';
	public static final char CONSUMO_DEFECTO = 'F';
	public static final double PRECIO_DEFECTO = 100;
	public static final float PESO_DEFECTO = 5;
	public static final String COLORES[] = {"blanco","negro","rojo","azul","gris"};
	public static final String COLOR_DEFECTO = "blanco";
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected float peso;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	public Electrodomestico(double precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
	}

	public Electrodomestico(double precioBase, String color, char consumo, float peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
}
