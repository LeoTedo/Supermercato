import java.time.LocalDate;
public class PrAlimentare extends Prodotto {
	public static String [] listamat = {"metallo","legno","vetro","Plastica","oro"};
    public static String [] listadesc= {"bello","brutto","grosso","piccolo","biuso"};
	public PrAlimentare(double prezzo, int codiceAbarre, String desc, LocalDate scandenza) {
		super(prezzo, codiceAbarre, desc);
		
		
	}

}
