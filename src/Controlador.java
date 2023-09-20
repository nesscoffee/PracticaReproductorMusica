import generadores.*;
import reproductor.ReproductorMusica;

public class Controlador {

	public static void main(String[] args) {
		
		Generador generadorLetra = new GeneradorLetra(args, args);
		generadorLetra.generar();
		Generador generadorMusica = new GeneradorMusica("Java", args);
		generadorMusica.generar();
		
		ReproductorMusica reproductor = new ReproductorMusica();
	}
}
