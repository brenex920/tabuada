package model;

public class tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	public void setMutiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMinimoMultiplicador(double minimoMutiplicador) {
		this.minimoMultiplicador = minimoMutiplicador;
	}
	
	public double getMinimoMutiplicador() {
		return minimoMultiplicador;
	}
	public void setMaximoMutiplicador(double maximoMutiplicador) {
		this.maximoMultiplicador = maximoMutiplicador;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
		
	}
	
	
	
	
	public void mostrarTabuada() {
		
		double contador = minimoMultiplicador;
		
		while (contador <= maximoMultiplicador ) {
			
			double produto = multiplicando * contador;
			System.out.println(multiplicando + " X " + contador + " = " + produto );
			
			
					
			contador = contador + 1;
		}

		
		
		
	}
	
	
}
