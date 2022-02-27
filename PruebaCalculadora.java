
public class PruebaCalculadora {
	public static void main(String[] args) {
		Calculadora cuentaHuevos = new Calculadora();

		System.out.println("El resultado de la suma de 5 + 6 es: ");
		System.out.println(cuentaHuevos.sumar(5,6));
		
		System.out.println("El resultado de la resta de 10 - 5 es: ");
		System.out.println(cuentaHuevos.restar(10,5));
		
		System.out.println("El resultado de la multiplicacion de 2 * 4 es: ");
		System.out.println(cuentaHuevos.multiplicar(2,4));
		
		System.out.println("El resultado de la division de 10 / 2 es: ");
		System.out.println(cuentaHuevos.dividir(10,2));
		
		System.out.println("La calculadora se encuentra apagada");
		
		System.out.println("La calculadora se encuentra encendida");
	}

}

