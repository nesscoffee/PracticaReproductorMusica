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
	public Cancion generar(Cancion cancion) {
		//...
		//cancion.setMusic();
		return cancion;
	}

	@Override
	public void cambiarIA(String tipoIA) {
		this.tipoIA = tipoIA;
		//...
	} 
}
