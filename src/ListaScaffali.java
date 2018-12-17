import java.time.LocalDate;

public class ListaScaffali {
	public static Prodotto[] listaprodotti = new Prodotto[20];
	static int x = 0;


	public static void main(String[] args) {
      Genera();
      StampaLista();
      
      
	}

	public static void Genera() {
		do {
			x++;
			int menu = (int) (Math.random() * (1 - 0));
			switch (menu) {
			case 0:
				for (int i = 0; i < 1; i++) {

					int n = (int) (Math.random() * (4 - 0));
					double prezzo = Math.random() * (100 - 1);
					int CodiceAbarre = (int) (Math.random() * (90000 - 10000));
					String Desc = PrNonAlimentare.listadesc[n];
					String mat = PrNonAlimentare.listamat[n];
					PrNonAlimentare pr = new PrNonAlimentare(prezzo, CodiceAbarre, Desc, mat);
					listaprodotti[i] = pr;
					i++;
				}
				break;

			case 1:
				for (int i = 0; i < 1; i++) {
					int g = (int) (Math.random() * (31 - 1));
					int m = (int) (Math.random() * (12 - 1));
					int a = (int) (Math.random() * (2100 - 2018));
					int n = (int) (Math.random() * (4 - 0));
					double prezzo = Math.random() * (100 - 1);
					int CodiceAbarre = (int) (Math.random() * (90000 - 10000));
					String Desc = PrAlimentare.listadesc[n];
					LocalDate scadenza = LocalDate.of(g, m, a);
					PrAlimentare pr = new PrAlimentare(prezzo, CodiceAbarre, Desc, scadenza);
					listaprodotti[i] = pr;
					i++;
				}
				break;

			}
		} while (x <= listaprodotti.length);
	}
	public static void StampaLista() {
		for (int i = 0; i < listaprodotti.length; i++) {
			System.out.print(listaprodotti[i]);
		}
	}






}