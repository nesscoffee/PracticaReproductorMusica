import generadores.*;
import reproductor.ReproductorMusica;

public class Controlador {
	
	Cancion cancionFinal;

	public static void main(String[] args) {
		
		// Aqui en la clase controladora se le preguntara al usuario las frases que quiere usar
		String frases = "Hola, Programacion, Dell";
		// Tambien se le preguntara que genero(s) de cancion quiere que sea
		String generosString = "Pop, Rock, Metal";
		String[] generos = generosString.split(", ");
		
		GeneradorLetra generadorLetra = new GeneradorLetra();
		GeneradorLetra generadorMusica = new GeneradorLetra();
		Controlador control = new Controlador();
		
		for(int i = 0; i < generos.length; i++) {
			generadorLetra.generar(control.cancionFinal, true, generos[i], frases);
			// True, por que ocupamos que se mezclen.
		}
		
		ReproductorMusica reproductor = new ReproductorMusica();
		reproductor.reproducir(control.cancionFinal);
	}
}
