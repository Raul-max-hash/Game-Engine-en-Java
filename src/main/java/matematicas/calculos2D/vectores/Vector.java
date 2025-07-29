package matematicas.calculos2D.vectores;

public class Vector {
	private double coordenadaX;
	private double coordenadaY;
	
	public Vector(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public Vector() {
		this.coordenadaX = 0.0;
		this.coordenadaY = 0.0;
	}
	
	public double getCoordenadaX() {
		return coordenadaX;
	}
	
	public void setCoordenadaX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	
	public double getCoordenadaY() {
		return coordenadaY;
	}
	
	public void setCoordenadaY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
}
