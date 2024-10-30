package Ex1;

public class Funcionario {

	
	private double vendasBrutas;
	
	

	

	public double getVendasBrutas() {
		return vendasBrutas;
	}





	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}





	public double calculaSalario() {
		double salarioBase;

		if (vendasBrutas >= 8000) {
			salarioBase = 382.33 + (0.08675 * vendasBrutas);
			
		} else {
			salarioBase = 117.12 + (0.0387 * vendasBrutas);
			
		}
		
		return salarioBase;
		
	}

	

}
