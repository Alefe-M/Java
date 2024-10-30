package Ex2;

public class PrincipalQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println("A area dos quadrados: ");
		System.out.println("Q1: " + q1.area());
		System.out.println("Q2: " + q2.area());
		System.out.println("Q3: " + q3.area());
		
		System.out.println("O perimetro dos quadrados: ");
		System.out.println("Q1: " + q1.perimetro());
		System.out.println("Q2: " + q2.perimetro());
		System.out.println("Q3: " + q3.perimetro());
		
		
	}

}
