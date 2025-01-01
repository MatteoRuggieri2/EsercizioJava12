package esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StampaMatriceDaFile {
	
	StampaMatriceDaFile (String fileName, int numRighe, int numColonne) {
		this.stampa(fileName, numRighe, numColonne);
	}

	public String stampa (String fileName, int numRighe, int numColonne) {
		
		// Controllo l'esistenza del file
		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("INVALID-FILE-NAME | Non è stato trovato alcun file al seguente path: \"" + fileName + "\"");
			e.printStackTrace();
		}
		
		return "";
	}
	
	// Funzione che controlli l'esistenza del file
	
	// Funzione che legge il file

	// Funzione che controlli che siano presenti 3 righe e che ogni riga abbia 3 token (int)
	
	// Funzione che trascriva i dati nella matrice
	

}
