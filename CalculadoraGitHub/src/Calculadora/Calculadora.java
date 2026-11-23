package Calculadora;

public class Calculadora {

	public static void main(String[] args) {
		
		System.out.println("Calculadora GitHub");
		System.out.println("Suma: " + sumar(8, 4));
		System.out.println("Resta: " + restar(8, 4));
		System.out.println("Multiplicación: " + multiplicar(8, 4));
		System.out.println("División: " + dividir(8, 4));
		System.out.println("División por cero: " + dividir(8, 0));
		System.out.println("2 elevado a 3: " + potencia(2, 3));
        System.out.println("5 elevado a 0: " + potencia(5, 0));
        System.out.println("2 elevado a -2: " + potencia(2, -2));
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

	public static double dividir(double a, double b) {
		if (b == 0) {
			System.out.println("Error: No se puede dividir entre cero.");
			return 0;
		}
		return a / b;
	}
	
    public static double potencia(double base, int exponente) {
        double resultado = 1.0;
        int expAbsoluto = Math.abs(exponente);

        for (int i = 0; i < expAbsoluto; i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            return 1.0 / resultado;
        }
        return resultado;
    }
}
