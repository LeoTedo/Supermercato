import java.text.DecimalFormat;

public class PrNonAlimentare extends Prodotto {
	DecimalFormat df2 = new DecimalFormat("###.##");
	public static String [] listamat = {"metallo","legno","vetro","Plastica","oro"};
    @Override
	public String toString() {
		return "*Non alimentare* materiale: " + mat + " / prezzo: " + df2.format(prezzo) + " / Codice a barre: " + CodiceAbarre + " / Descrizione: "
				+ Desc + " ";
	}

	public static String [] listadesc= {"bello","brutto","grosso","piccolo","fragile"};
    String mat;
	
    public PrNonAlimentare(double prezzo, int codiceAbarre, String desc, String mat) {
		super(prezzo, codiceAbarre, desc);
		this.mat = mat;
	}



}
