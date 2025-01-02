package esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StampaMatriceDaFile {
	
	private File file;
	
	public void setFile(String fileName) {
		this.file = new File(fileName);		
	}
	
	StampaMatriceDaFile (String fileName, int numRighe, int numColonne) {
		setFile(fileName);
		stampa(fileName, numRighe, numColonne);
	}

	public String stampa (String fileName, int numRighe, int numColonne) {
		
		ifFileExists(this.file);
		
		return "";
	}
	
	// Funzione che controlla l'esistenza del file
	public boolean ifFileExists(File fileToCheck) {
		try {
			FileReader fr = new FileReader(fileToCheck);
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("INVALID-FILE-NAME | Non è stato trovato alcun file al seguente path: \"" + this.file.getPath() + "\"");
			e.printStackTrace();
		}
		return false;
	}
	
	// Funzione che legge il file

	// Funzione che controlli che siano presenti 3 righe e che ogni riga abbia 3 token (int)
	
	// Funzione che trascriva i dati nella matrice
	

}
