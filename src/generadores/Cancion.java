package generadores;

import java.util.ArrayList;

public class Cancion {
	private String lyrics;
	public ArrayList<String> generos;
	private byte[] music;
	// La cancion es un array de bytes debido a que asi se puede procesar sin llamar librerias externas.
	
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public ArrayList<String> getGeneros() {
		return generos;
	}
	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}
	public byte[] getMusic() {
		return music;
	}
	public void setMusic(byte[] music) {
		this.music = music;
	}
}
