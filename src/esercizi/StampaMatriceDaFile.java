package esercizi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StampaMatriceDaFile {
	
	private File file;
	
	private int numRighe;
	
	private int numColonne;
	
	
	
	public void setFile(String fileName) {
		this.file = new File(fileName);		
	}
	
	public void setNumRighe(int numRighe) {
		this.numRighe = numRighe;
	}
	
	public void setNumColonne(int numColonne) {
		this.numColonne = numColonne;		
	}
	
	
	
	StampaMatriceDaFile (String fileName, int numRighe, int numColonne) {
		setFile(fileName);
		stampa(fileName, numRighe, numColonne);
	}

	
	
	public String stampa (String fileName, int numRighe, int numColonne) {
		
		if (!ifFileExists(this.file)) {
			return "INVALID-FILE-NAME";
		}
		
		readFile(this.file);
		
		return "OK";
	}
	
	// Funzione che controlla l'esistenza del file
	public boolean ifFileExists(File fileToCheck) {
		try {
			FileReader fr = new FileReader(fileToCheck);
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Non è stato trovato alcun file al seguente path: \"" + this.file.getPath() + "\"");
			e.printStackTrace();
			return false;
		}
	}
	
	// Funzione che legge il file
	private boolean readFile (File fileToRead) {
		
		try {
			FileReader fr = new FileReader(fileToRead); // Crea un lettore di file
			BufferedReader br = new BufferedReader(fr); // Crea un buffer di lettura
			String line = br.readLine(); // Leggo la prima riga del file
			
			while (line != null) {
			    Scanner scn = new Scanner(line);
			    
			    System.out.println("Riga:");
			    System.out.println(line + "\n");
			    
			    
			    for (int i = 0; i < this.numColonne; i++) {
			    	if (!scn.hasNextInt()) {  // Potrebbe non leggerli come int ma come stringhe
			    		scn.close();
			    		return false;
			    	}
			    	
			    	int currentNum = scn.nextInt();
			    	System.out.println(currentNum);
					
				}
			    
			    
			    
			    line = br.readLine(); // Leggo la riga successiva e continuo il loop
			}
			
			br.close();
			    
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	// Funzione che controlli che siano presenti 3 righe e che ogni riga abbia 3 token (int)
	
	// Funzione che trascriva i dati nella matrice
	

}
