package generadores;

public abstract class Generador {
	String tipoIA;
	String contrasenaIA;
	Cancion cancion;
	public abstract Cancion generar(Cancion cancion);
	public void cambiarIA(String tipoIA) {}
}
