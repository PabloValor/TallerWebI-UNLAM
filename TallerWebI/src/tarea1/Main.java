package tarea1;

public class Main {

	public static void main(String[] args) {
		
		try {
			Rectangulo rectangulo = new Rectangulo(7, 2);
			Cuadrado cuadrado = new Cuadrado();
			
			System.out.println("Area del rectangulo: " + rectangulo.ObtenerArea());
			System.out.println("Perimetro del rectangulo: " + rectangulo.ObtenerPerimetro());
			System.out.println("El area del cuadrado es: "+ cuadrado.ObtenerArea());
			System.out.println("El perimetro del cuadrado es: "+ cuadrado.ObtenerPerimtero());
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
