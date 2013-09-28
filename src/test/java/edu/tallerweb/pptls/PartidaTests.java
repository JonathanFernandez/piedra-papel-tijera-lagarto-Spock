package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	//Tijera corta papel
	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Papel cubre piedra
	@Test
	public void quePapelCubrepiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Piedra aplasta lagarto
	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Lagarto envenena Spock
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Spock destroza tijera
	@Test
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Tijera decapita lagarto
	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Lagarto come papel
	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	//Papel refuta Spock
	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	//Piedra aplasta tijera
	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

}
