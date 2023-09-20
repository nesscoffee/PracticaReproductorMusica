package generadores;

public class Cancion {
	String lyrics;
	String generos;
	byte[] music;
	
	public String getLyrics() {
		return lyrics;
	}
	
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	public String getGeneros() {
		return generos;
	}
	
	public void setGeneros(String generos) {
		this.generos = generos;
	}
	
	public byte[] getMusic() {
		return music;
	}
	
	public void setMusic(byte[] music) {
		this.music = music;
	}
}
