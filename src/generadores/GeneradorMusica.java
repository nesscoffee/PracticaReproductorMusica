package generadores;

public class GeneradorMusica extends Generador {
	
	private String tipoIA;
	private String contrasenaIA;
	
	public GeneradorMusica(String letra, String[] generos) {
		//...
	}
	
	@Override
	public void generar() {
		//...
	}

	@Override
	public void cambiarIA(String tipoIA) {
		this.tipoIA = tipoIA;
		//...
	} 
}
