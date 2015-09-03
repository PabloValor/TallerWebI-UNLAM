package tarea1;

public class Main {

	public static void main(String[] args) {
		
		try {
			Rectangulo rectangulo = new Rectangulo(7, 2);
			
			System.out.println("Area del rectangulo: " + rectangulo.ObtenerArea());
			System.out.println("Perimetro del rectangulo: " + rectangulo.ObtenerPerimetro());
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
