package ejercicio3;

/**
 * java-full-stack-dev-u08 - ejercicio3 - AppElectrodomestico
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class AppElectrodomestico {

	public static void main(String[] args) {
		
		//Generamos 3 objetos para ver lo tres constructores
		Electrodomestico electroDefecto = new Electrodomestico();
		Electrodomestico electroPesoPrecio = new Electrodomestico(200,10);
		Electrodomestico electroTodos = new Electrodomestico(300,"negro",'A',15);
		
		//Objeto constructor por defecto
		System.out.println("Electrodomestico con constructor por defecto" + " Color " + electroDefecto.getColor()
				+ " Peso " + electroDefecto.getPeso() + " Kg " + " Consumo " + electroDefecto.getConsumo() + " Precio "
				+ electroDefecto.getPrecioBase() + " €");
		
		//Objeto constructor con precio y peso por parametros
		System.out.println("Electrodomestico con constructor con el precio y peso. El resto por defecto" + " Color "
				+ electroPesoPrecio.getColor() + " Peso " + electroPesoPrecio.getPeso() + " Kg " + " Consumo "
				+ electroPesoPrecio.getConsumo() + " Precio " + electroPesoPrecio.getPrecioBase() + " €");

		//Objeto constructor con todos los atributos por parametro
		System.out.println("Electrodomestico con constructor con todos los atributos" + " Color "
				+ electroTodos.getColor() + " Peso " + electroTodos.getPeso() + " Kg " + " Consumo "
				+ electroTodos.getConsumo() + " Precio " + electroTodos.getPrecioBase() + " €");
		
	}

}
