package tarea1;

public class Rectangulo {
	private int _largo;
	private int _ancho;
	
	public Rectangulo(int pLargo, int pAncho) throws Exception {
		if((int)pLargo == pLargo && (int)pAncho == pAncho && pAncho > 0 && pLargo > 0) {
			this._largo = pLargo;
			this._ancho = pAncho;
		} else {
			throw new Exception("No se puede crear una instancia de tipo " + this.getClass().getName() + " Se le han pasado parametros incorrectos");
		}
	}
	
	public int ObtenerLargo() {
		return this._largo;
	}
	
	public int ObtenerAncho() {
		return this._ancho;
	}
	
	public int ObtenerArea() {
		return this._ancho * this._largo; 
	}
	
	public int ObtenerPerimetro() {
		return (this._ancho * 2) + (this._largo * 2); 
	}
	
}
