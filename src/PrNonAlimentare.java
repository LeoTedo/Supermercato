
public class PrNonAlimentare extends Prodotto {
	public static String [] listamat = {"metallo","legno","vetro","Plastica","oro"};
    public static String [] listadesc= {"bello","brutto","grosso","piccolo","biuso"};
    String mat;
	
    public PrNonAlimentare(double prezzo, int codiceAbarre, String desc, String mat) {
		super(prezzo, codiceAbarre, desc);
		this.mat = mat;
	}



}
