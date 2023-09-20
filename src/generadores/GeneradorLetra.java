package generadores;

public class GeneradorLetra extends Generador {
	
	private String tipoIA;
	private String contrasenaIA;
	private String[] frases;
	private String[] generos;
	private Cancion cancion;
	
	public GeneradorLetra(String[] frases, String[] generos) {
		this.frases = frases;
		this.generos = generos;
		//...
	}
	
	@Override
	public Cancion generar(Cancion cancion) {
		String generosAsString = String.join(", ", generos);
		//...
		cancion.setGeneros(generosAsString);
		cancion.setLyrics("?");
		return cancion;
	};

	@Override
	public void cambiarIA(String tipoIA) {
		this.tipoIA = tipoIA;
		//...
	} 
}
