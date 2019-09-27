package application;

public class Auto {

	private String targa;
	private String modello;
	private float km;
	private int anno;
	private int prezzo;
	
	public Auto(String targa, String modello, float km, int anno, int prezzo) {
		this.targa = targa;
		this.modello = modello;
		this.km = km;
		this.anno = anno;
		this.prezzo = prezzo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public String getTarga() {
		return targa;
	}
	
}
