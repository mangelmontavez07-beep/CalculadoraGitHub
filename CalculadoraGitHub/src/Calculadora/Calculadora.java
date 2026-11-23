package Calculadora;

public class Calculadora {

	public static void main(String[] args) {
		
		System.out.println("Calculadora GitHub");
		System.out.println("Suma: " + sumar(8, 4));
		System.out.println("Resta: " + restar(8, 4));
		System.out.println("Multiplicación: " + multiplicar(8, 4));
	}

	public static double sumar(double a, double b) {
		return a + b;
	}

	public static double restar(double a, double b) {
		return a - b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}
}

