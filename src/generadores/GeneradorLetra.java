package generadores;

import java.util.ArrayList;

public class GeneradorLetra extends Generador {
	
	private String tipoIA;
	private String contrasenaIA;
	private String[] frases;
	private Cancion cancion;
	
	@Override
	public Cancion generar(Cancion cancion, boolean mezclarGenero, String genero, String frases) {
		if (mezclarGenero) {
			// Aca se mezcla si hay otro presente
			String aMezclar = cancion.getLyrics();
			
			cancion.setLyrics("Mezclado");
		} else {
			// Aca se sobreescribe
			cancion.setLyrics("?");
		}
		return cancion;
	};

	@Override
	public void cambiarIA(String tipoIA) {
		this.tipoIA = tipoIA;
		//...
	} 
}
