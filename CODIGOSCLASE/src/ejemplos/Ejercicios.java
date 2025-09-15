package ejemplos;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Programa que calcula el área de un triángulo a partir de
		//   su base y su altura.
		float base,altura,area;
		base = 9.5f;
		altura = 3.4f;
		
		area = (base * altura)/2;
		
		System.out.println("El área es: " + area);
		
		//2. Programa que calcula el precio final de un producto a partir
		// de su precio inicial y el % de descuento.
		float precioInicial, descuento, precioFinal;
		
		precioInicial = 34.56F;
		descuento = 14;
		
		precioFinal = precioInicial - (descuento*precioInicial)/100;
		
		System.out.println("Precio inicial: " + precioInicial);
		System.out.println("Precio final: " + precioFinal);
		System.out.printf("Precio final: %,.2f€ \n" , precioFinal);
		System.out.println("Precio final: " + precioFinal + "\u20AC");
		
		
	}

}
