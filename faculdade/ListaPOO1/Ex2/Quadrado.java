package Ex2;

public class Quadrado {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(double lado) {
		this.lado = lado;
		}
	
	
	public double perimetro() {
		 double perimetro = (lado * 4);
		return perimetro;
	}
	
	public double area() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	
	
	
	

}
