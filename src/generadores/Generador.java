package generadores;

public abstract class Generador {
	String tipoIA;
	String contrasenaIA;
	Cancion cancion;
	public abstract Cancion generar(Cancion cancion, boolean mezclarGenero, String genero, String frases);
	public void cambiarIA(String tipoIA) {}
}
