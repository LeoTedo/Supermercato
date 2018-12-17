import java.time.LocalDate;

public abstract class Prodotto {
	public double prezzo;
	public int CodiceAbarre;
	public String Desc;
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCodiceAbarre() {
		return CodiceAbarre;
	}
	public void setCodiceAbarre(int codiceAbarre) {
		CodiceAbarre = codiceAbarre;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public Prodotto(double prezzo, int codiceAbarre, String desc) {
		this.prezzo = prezzo;
		CodiceAbarre = codiceAbarre;
		Desc = desc;
	}
	public void ApplicaSconto() {
		prezzo=prezzo-(prezzo*0.05);
	}

}
