package test;


import static org.junit.Assert.*;
import tarea1.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void ObtenerArea() throws Exception {
		Rectangulo rec = new Rectangulo(2, 3);
		final int _valorEsperado = 6;
		
		org.junit.Assert.assertEquals(_valorEsperado, rec.ObtenerArea());
	}
	
	@Test
	public void ObtenerPerimetro() throws Exception {
		Rectangulo rec = new Rectangulo(2, 3);
		final int _valorEsperado = 10;
		
		org.junit.Assert.assertEquals(_valorEsperado, rec.ObtenerPerimetro());
	}

}
