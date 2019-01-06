import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class ListaScaffali {
	public static Prodotto[] listaprodotti = new Prodotto[20];
	static int x = 0;
	

	// public static LocalDate createScadenza() {
	// int day = ThreadLocalRandom.current().nextInt(1, 31);
	// int month = ThreadLocalRandom.current().nextInt(1, 12);
	// int year = ThreadLocalRandom.current().nextInt(2019, 2020);
	// return LocalDate.of(year, month, day);
	// }


	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (2021 - 2018));
	}

	public static void Genera() {
		for (int x = 0; x < 20; x++) {
			int menu = 0;
			switch (menu) {
			case 0:
				int n = (int) (Math.random() * (5 - 0));
				double prezzo = (float) Math.random() * (100 - 1);
				int CodiceAbarre = (int) (Math.random() * (90000 - 10000));
				String Desc = PrNonAlimentare.listadesc[n];
				String mat = PrNonAlimentare.listamat[n];
				PrNonAlimentare pr = new PrNonAlimentare(prezzo, CodiceAbarre, Desc, mat);
				listaprodotti[x] = pr;
				break;

			case 1:
				int year = ThreadLocalRandom.current().nextInt(2019, 2021);
				int month = ThreadLocalRandom.current().nextInt(1, 13);
				int day = ThreadLocalRandom.current().nextInt(1, 32);
				LocalDate scadenza = LocalDate.of(year, month, day);
				//System.out.println(month);
				//System.out.println(day);
				//System.out.println(year);
				int na = (int) (Math.random() * (4 - 0));
				double prezzoa = Math.random() * (100 - 1);
				int CodiceAbarrea = (int) (Math.random() * (90000 - 10000));
				String Desca = PrAlimentare.listadesc[na];
				PrAlimentare pra = new PrAlimentare(prezzoa, CodiceAbarrea, Desca, scadenza);
				listaprodotti[x] = pra;
				break;

			}
		}
	}

	public static void StampaLista() {
		for (int i = 0; i < listaprodotti.length; i++) {
			System.out.println(i+" - "+listaprodotti[i]);

		}
	}

}