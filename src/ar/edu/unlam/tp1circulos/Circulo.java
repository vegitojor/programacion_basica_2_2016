package ar.edu.unlam.tp1circulos;

public class Circulo {
	private Double radio;
	
	public Circulo(Double radio ){
		this.radio = radio;
	}
	
	
	public Double getRadio() {
		return radio;
	}

	public Double calcularPerimetro(){
		Double perimetro = this.radio * 3.14 * 2.0;
		return perimetro;
	}
	
}

