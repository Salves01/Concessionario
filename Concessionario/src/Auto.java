
public class Auto {

	//targa descrizione km anni prezzo
	private String targa;
	private String descrizione;
	private int km;
	private int anno;
	private float prezzo;
	
	public Auto(String targa, String descrizione, int km, int anno, float prezzo) {
		this.targa = targa;
		this.descrizione = descrizione;
		this.km = km;
		this.anno = anno;
		this.prezzo = prezzo;
	}

	public String getTarga() {
		return targa;
	}

//	public void setTarga(String targa) {
//		this.targa = targa;
//	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
}
