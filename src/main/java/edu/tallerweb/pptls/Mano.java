package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Forma formaMano;
	
	public Mano(final Forma forma) {
		this.formaMano = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Resultado res = Resultado.EMPATA;
		if(this.formaMano == Forma.TIJERA && otra.formaMano == Forma.PAPEL)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.PAPEL && otra.formaMano == Forma.PIEDRA)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.PIEDRA && otra.formaMano == Forma.LAGARTO)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.LAGARTO && otra.formaMano == Forma.SPOCK)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.SPOCK && otra.formaMano == Forma.TIJERA)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.TIJERA && otra.formaMano == Forma.LAGARTO)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.LAGARTO && otra.formaMano == Forma.PAPEL)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.PAPEL && otra.formaMano == Forma.SPOCK)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.SPOCK && otra.formaMano == Forma.PIEDRA)
			return res = Resultado.GANA;
		if(this.formaMano == Forma.PIEDRA && otra.formaMano == Forma.TIJERA)
			return res = Resultado.GANA;
		
		if(otra.formaMano == Forma.TIJERA && this.formaMano == Forma.PAPEL)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.PAPEL && this.formaMano == Forma.PIEDRA)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.PIEDRA && this.formaMano == Forma.LAGARTO)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.LAGARTO && this.formaMano == Forma.SPOCK)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.SPOCK && this.formaMano == Forma.TIJERA)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.TIJERA && this.formaMano == Forma.LAGARTO)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.LAGARTO && this.formaMano == Forma.PAPEL)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.PAPEL && this.formaMano == Forma.SPOCK)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.SPOCK && this.formaMano == Forma.PIEDRA)
			return res = Resultado.PIERDE;
		if(otra.formaMano == Forma.PIEDRA && this.formaMano == Forma.TIJERA)
			return res = Resultado.PIERDE;
		return res;
		
		
	}

}
