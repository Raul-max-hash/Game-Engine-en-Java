package matematixasFunciones;


public class FuncionesMatematicas {

	public static Double potencia(int base, int potencia) {
		for(int number = 0; number <= potencia; number++) {
			base *= potencia;
		}
		return Double.valueOf(base);
	}
	
	public static double raizCuadradaNewton(double numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("Error al sacar raiz de un numero 0 o inferior");
		}
		if(numero == 0 || numero == 1) {
			return numero;
		}
		
		double xn = numero;
		double precision = 1e-10;
		
		while(true) {
			double nuevaAproximacion = 0.5 * (xn + (numero / xn));
			if(Math.abs(xn - nuevaAproximacion) < precision) {
				break;
			}
			xn = nuevaAproximacion;
		}
		
		return xn;
	}
}
