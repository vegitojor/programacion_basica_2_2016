package ar.edu.unlam.tp1circulos;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		Circulo miCirculo1 = new Circulo(2.0);
		Double esperado = 2.0;
		
		Assert.assertEquals(esperado, miCirculo1.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3punto7() {
		Circulo miCirculo2 = new Circulo(3.7);
		Double esperado = 3.7;
		
		Assert.assertEquals(esperado, miCirculo2.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo miCirculo3 = new Circulo(5.0);
		Double esperado = 5.0;
		
		Assert.assertEquals(esperado, miCirculo3.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10punto9() {
		Circulo miCirculo4 = new Circulo(10.9);
		Double esperado = 10.9;
		
		Assert.assertEquals(esperado, miCirculo4.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio9p8yPerimetro61p54() {
		Circulo miCirculo5 = new Circulo(9.8);
		Double esperado = 61.54;
		Double actual = miCirculo5.calcularPerimetro();
		
		Assert.assertEquals(esperado, actual, 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16p6yPerimetro104p24() {
		Circulo miCirculo6 = new Circulo(16.6);
		Double esperado = 104.24;
		Double actual = miCirculo6.calcularPerimetro();
		
		Assert.assertEquals(esperado, actual, 0.01);
	}
}
