import java.text.DecimalFormat;
import java.util.*;

public class ListaSpesa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("###.##");
		int spes = 0;
		int cont = 0;
		double totale = 0;
		Prodotto[] spesa = new Prodotto[20];
		ListaScaffali.Genera();
		do {
			System.out.println("1. Per aggiungere un prodotto alla tua lista della spesa");
			System.out.println("2. Per rimuovere un prodotto alla tua lista della spesa");
			System.out.println("3. Per applicare lo sconto e visualizzare il totale");
			System.out.println("9. Per uscire dal supermercato");
			spes = sc.nextInt();
			switch (spes) {
			case 1:
				ListaScaffali.StampaLista();
				System.out.println("Scegli il numero del prodotto che desideri aggiungere");
				int add = sc.nextInt();
				spesa[cont] = ListaScaffali.listaprodotti[add];
				ListaScaffali.listaprodotti[add] = null;
				cont++;
				break;
			case 2:
				for (int i = 0; i < spesa.length; i++) {
					if (spesa[i] != null) {
						System.out.println(i + " - " + spesa[i]);
					}
				}
				System.out.println("Scegli il numero del prodotto che desideri rimuovere");
				int del = sc.nextInt();
				spesa[del] = null;
				break;
			case 3:
				System.out.println("Questa è la tua lista della spesa: ");
				for (int i = 0; i < spesa.length; i++) {
					if (spesa[i] != null) {
						System.out.println(i + " - " + spesa[i]);
						totale  += spesa[i].prezzo ;
					}
				}
				System.out.println("Il tuo totale è : " + df2.format(totale));
				totale=totale-(totale*0.05);
				System.out.println("Il tuo totale è scontato é : " + df2.format(totale));
			}
		} while (spes != 9);
	}

}
