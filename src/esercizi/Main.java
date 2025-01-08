package esercizi;

public class Main {

	public static void main(String[] args) {
		
		StampaMatriceDaFile smdf = new StampaMatriceDaFile();
		System.out.println(smdf.stampa("src/files/matrice.txt", 3, 3));
	}

}
