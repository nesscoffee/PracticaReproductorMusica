import generadores.*;
import reproductor.ReproductorMusica;

public class Controlador {

	public static void main(String[] args) {
		
		Generador generadorLetra = new GeneradorLetra(args, args);
		Cancion cancion;
		generadorLetra.generar(cancion);
		Generador generadorMusica = new GeneradorMusica(cancion);
		generadorMusica.generar(cancion);
		
		ReproductorMusica reproductor = new ReproductorMusica();
	}
}
