package edu.eci.cvds.tdd.aerodescuentos;
import static edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa;
import static org.junit.Assert.*;
import org.junit.Test;

class TarifasTest {
	private CalculadorDescuentos cal = new CalculadorDescuentos();
	@Test
	void primerCondicion() {
		assertEquals(95,calculoTarifa(100,0,0),0.0001);
	}
	@Test
	void segundaCondicion() {
		assertEquals(95,calculoTarifa(100,0,0),0.0001);
		assertEquals(95,calculoTarifa(100,0,1),0.0001);
		assertEquals(95,calculoTarifa(100,0,17),0.0001);
		assertEquals(100,calculoTarifa(100,0,18),0.0001);
		assertEquals(100,calculoTarifa(100,0,19),0.0001);
		assertEquals(100,calculoTarifa(100,20,0),0.0001);
		assertEquals(100,calculoTarifa(100,20,17),0.0001);
		assertEquals(100,calculoTarifa(100,20,18),0.0001);
		assertEquals(100,calculoTarifa(100,20,19),0.0001);
		assertEquals(95,calculoTarifa(100,19,0),0.0001);
		assertEquals(95,calculoTarifa(100,19,17),0.0001);
		assertEquals(100,calculoTarifa(100,19,18),0.0001);
		assertEquals(100,calculoTarifa(100,19,19),0.0001);
	}
	@Test
	void tercerCondicion() {
		assertEquals(95,calculoTarifa(100,19,0),0.0001);
		assertEquals(95,calculoTarifa(100,19,17),0.0001);
		assertEquals(100,calculoTarifa(100,19,18),0.0001);
		assertEquals(100,calculoTarifa(100,19,19),0.0001);
		assertEquals(100,calculoTarifa(100,20,0),0.0001);
		assertEquals(100,calculoTarifa(100,20,17),0.0001);
		assertEquals(100,calculoTarifa(100,20,18),0.0001);
		assertEquals(100,calculoTarifa(100,20,19),0.0001);
		assertEquals(80,calculoTarifa(100,21,0),0.0001);
		assertEquals(80,calculoTarifa(100,21,17),0.0001);
		assertEquals(85,calculoTarifa(100,21,18),0.0001);
		assertEquals(85,calculoTarifa(100,21,19),0.0001);
	}
	@Test
	void cuartaCondicion() {
		assertEquals(100,calculoTarifa(100,0,64),0.0001);
		assertEquals(100,calculoTarifa(100,0,65),0.0001);
		assertEquals(92,calculoTarifa(100,0,66),0.0001);
		assertEquals(92,calculoTarifa(100,0,121),0.0001);
		assertEquals(92,calculoTarifa(100,0,122),0.0001);
		assertEquals(92,calculoTarifa(100,0,123),0.0001);
		assertEquals(100,calculoTarifa(100,19,64),0.0001);
		assertEquals(100,calculoTarifa(100,19,65),0.0001);
		assertEquals(92,calculoTarifa(100,19,66),0.0001);
		assertEquals(92,calculoTarifa(100,19,121),0.0001);
		assertEquals(92,calculoTarifa(100,19,122),0.0001);
		assertEquals(92,calculoTarifa(100,19,123),0.0001);
		assertEquals(100,calculoTarifa(100,20,64),0.0001);
		assertEquals(100,calculoTarifa(100,20,65),0.0001);
		assertEquals(100,calculoTarifa(100,20,66),0.0001);
		assertEquals(100,calculoTarifa(100,20,121),0.0001);
		assertEquals(100,calculoTarifa(100,20,122),0.0001);
		assertEquals(100,calculoTarifa(100,20,123),0.0001);
		assertEquals(85,calculoTarifa(100,21,64),0.0001);
		assertEquals(85,calculoTarifa(100,21,65),0.0001);
		assertEquals(77,calculoTarifa(100,21,66),0.0001);
		assertEquals(77,calculoTarifa(100,21,121),0.0001);
		assertEquals(77,calculoTarifa(100,21,122),0.0001);
		assertEquals(77,calculoTarifa(100,21,123),0.0001);
	}
	@Test
	void quintaCondicion() {
		assertEquals(100,calculoTarifa(100,19,64),0.0001);
		assertEquals(100,calculoTarifa(100,19,65),0.0001);
		assertEquals(92,calculoTarifa(100,19,66),0.0001);
		assertEquals(92,calculoTarifa(100,19,121),0.0001);
		assertEquals(92,calculoTarifa(100,19,122),0.0001);
		assertEquals(92,calculoTarifa(100,19,123),0.0001);
		assertEquals(100,calculoTarifa(100,20,64),0.0001);
		assertEquals(100,calculoTarifa(100,20,65),0.0001);
		assertEquals(100,calculoTarifa(100,20,66),0.0001);
		assertEquals(100,calculoTarifa(100,20,121),0.0001);
		assertEquals(100,calculoTarifa(100,20,122),0.0001);
		assertEquals(100,calculoTarifa(100,20,123),0.0001);
		assertEquals(85,calculoTarifa(100,21,64),0.0001);
		assertEquals(85,calculoTarifa(100,21,65),0.0001);
		assertEquals(77,calculoTarifa(100,21,66),0.0001);
		assertEquals(77,calculoTarifa(100,21,121),0.0001);
		assertEquals(77,calculoTarifa(100,21,122),0.0001);
		assertEquals(77,calculoTarifa(100,21,123),0.0001);
	}
	@Test
	void sextaCondicion() {
		assertEquals(95,calculoTarifa(100,19,17),0.0001);
		assertEquals(100,calculoTarifa(100,19,18),0.0001);
		assertEquals(100,calculoTarifa(100,19,19),0.0001);
		assertEquals(100,calculoTarifa(100,19,64),0.0001);
		assertEquals(100,calculoTarifa(100,19,65),0.0001);
		assertEquals(92,calculoTarifa(100,19,66),0.0001);
		assertEquals(100,calculoTarifa(100,20,17),0.0001);
		assertEquals(100,calculoTarifa(100,20,18),0.0001);
		assertEquals(100,calculoTarifa(100,20,19),0.0001);
		assertEquals(100,calculoTarifa(100,20,64),0.0001);
		assertEquals(100,calculoTarifa(100,20,65),0.0001);
		assertEquals(100,calculoTarifa(100,20,66),0.0001);
		assertEquals(80,calculoTarifa(100,21,17),0.0001);
		assertEquals(85,calculoTarifa(100,21,18),0.0001);
		assertEquals(85,calculoTarifa(100,21,19),0.0001);
		assertEquals(85,calculoTarifa(100,21,64),0.0001);
		assertEquals(85,calculoTarifa(100,21,65),0.0001);
		assertEquals(77,calculoTarifa(100,21,66),0.0001);
	}
	@Test
	void septimaCondicion() {
		assertEquals(95,calculoTarifa(100,0,17),0.0001);
		assertEquals(100,calculoTarifa(100,0,18),0.0001);
		assertEquals(100,calculoTarifa(100,0,19),0.0001);
		assertEquals(100,calculoTarifa(100,0,64),0.0001);
		assertEquals(100,calculoTarifa(100,0,65),0.0001);
		assertEquals(92,calculoTarifa(100,0,66),0.0001);
		assertEquals(95,calculoTarifa(100,19,17),0.0001);
		assertEquals(100,calculoTarifa(100,19,18),0.0001);
		assertEquals(100,calculoTarifa(100,19,19),0.0001);
		assertEquals(100,calculoTarifa(100,19,64),0.0001);
		assertEquals(100,calculoTarifa(100,19,65),0.0001);
		assertEquals(92,calculoTarifa(100,19,66),0.0001);
		assertEquals(100,calculoTarifa(100,20,17),0.0001);
		assertEquals(100,calculoTarifa(100,20,18),0.0001);
		assertEquals(100,calculoTarifa(100,20,19),0.0001);
		assertEquals(100,calculoTarifa(100,20,64),0.0001);
		assertEquals(100,calculoTarifa(100,20,65),0.0001);
		assertEquals(100,calculoTarifa(100,20,66),0.0001);
		assertEquals(80,calculoTarifa(100,21,17),0.0001);
		assertEquals(85,calculoTarifa(100,21,18),0.0001);
		assertEquals(85,calculoTarifa(100,21,19),0.0001);
		assertEquals(85,calculoTarifa(100,21,64),0.0001);
		assertEquals(85,calculoTarifa(100,21,65),0.0001);
		assertEquals(77,calculoTarifa(100,21,66),0.0001);
	}
}
