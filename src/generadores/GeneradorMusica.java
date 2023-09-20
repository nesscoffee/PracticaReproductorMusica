package generadores;

public class GeneradorMusica extends Generador {
	
	private String tipoIA;
	private String contrasenaIA;
	private byte[] musica;
	private Cancion cancion;
	
	public GeneradorMusica(Cancion cancion) {
		this.cancion = cancion;
	}

	@Override
	public Cancion generar(Cancion cancion, boolean mezclarGenero, String genero, String frases) {
		if (mezclarGenero) {
			// Aca se mezcla si hay otro presente
			byte[] aMezclar = cancion.getMusic();
			
			cancion.setMusic("Mezclado");
		} else {
			// Aca se sobreescribe
			cancion.setMusic("?");
		}
		return cancion;
	}

	@Override
	public void cambiarIA(String tipoIA) {
		this.tipoIA = tipoIA;
		//...
	} 
}
