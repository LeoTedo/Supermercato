import java.time.LocalDate;
public class PrAlimentare extends Prodotto {
	
	public static String [] listamat = {"metallo","legno","vetro","Plastica","oro"};
    public static String [] listadesc= {"bello","brutto","grosso","piccolo","biuso"};
	public int month;
	public int year;
	public int day;
    public LocalDate scadenza = LocalDate.of(year, month, day);
	public PrAlimentare(double prezzo, int codiceAbarre, String desc, LocalDate scadenza) {
		super(prezzo, codiceAbarre, desc);
		this.scadenza = scadenza;
	}
	@Override
	public String toString() {
		return "Alimentare = scadenza: " + scadenza + " prezzo: " + prezzo + " CodiceAbarre: " + CodiceAbarre
				+ " Desc: " + Desc + " ";
	}


}
