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
		setNumRighe(numRighe);
		setNumColonne(numColonne);
		
		System.out.println(stampa(fileName, numRighe, numColonne));
	}

	
	
	public String stampa (String fileName, int numRighe, int numColonne) {
		
		/* Potresti provare a fare un unico metodo checkFile() che controlla le varie
		 * cose e se trova errori ritorna diverse stringhe.
		 * Il lato positivo di questo approccio è quello di avere meno codice duplicato,
		 * però ci sarà tanta roba nello stesso metodo.
		 * L'altro approccio sarebbe quello di fare un metodo per ogni controllo,
		 * questo però richiederebbe più risorse dato che bisognerebbe ceare un nuovo
		 * FileReader e un nuovo BufferReader per ogni metodo. */
		
		if (!ifFileExists(this.file)) {
			return "INVALID-FILE-NAME";
		}
		
		// Controllo che i token siano tutti numeri
		if (!checkFileIntToken(this.file)) {
			return "NOT-NUMERIC-VALUE";
		}
		
		// Controllo il numero di righe e di colonne
		if (!checkFileStructure(this.file)) {
			return "INVALID-DATA";
		}
		
		readFile(this.file);
		
		return "\nOK";
	}
	
	// Funzione che controlla l'esistenza del file
	public boolean ifFileExists(File fileToCheck) {
		try {
			FileReader fr = new FileReader(fileToCheck);
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Non è stato trovato alcun file al seguente path: \"" + this.file.getPath() + "\"");
//			e.printStackTrace();
			return false;
		}
	}
	
	// Funzione che controlla che tutti i token presenti siano di tipo "int"
	public boolean checkFileIntToken(File fileToCheck) {
		try {
			FileReader fr = new FileReader(fileToCheck);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			// Finchè c'è una riga
			while (line != null) {
			    Scanner scn = new Scanner(line);
			    
			    // Finchè c'è un token, controllo, se non è int ritorno "false"
			    while (scn.hasNext()) {
					if (!scn.hasNextInt()) {
						scn.close();
						return false;
					}
					scn.nextInt();
					
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
	
	public boolean checkFileStructure(File fileToCheck) {
		
		int fileRowCounter = 0;
		int fileColumnCounter = 0;
		
		try {
			FileReader fr = new FileReader(fileToCheck);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			// Finchè c'è una riga
			while (line != null) {
			    Scanner scn = new Scanner(line);
			    fileRowCounter++;
			    
			    // Se ci sono più righe rispetto a quelle previste ritorno "false"
			    if (fileRowCounter > this.numRighe) {
			    	scn.close();
					return false;
				}
			    
			    // Finchè c'è un token, controllo che non siano maggiori a quelli previsti
			    while (scn.hasNext()) {
					scn.nextInt();
					fileColumnCounter++;
					
					// Se ci sono più colonne di quelle previste ritorno "false"
					if (fileColumnCounter > this.numColonne) {
				    	scn.close();
						return false;
					}
				}
			    
			    fileColumnCounter = 0;
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
	
	// Funzione che legge il file
	private boolean readFile (File fileToRead) {
		
//		int fileRowCounter = 0;
//		int fileColumnCounter = 0;
		
		try {
			FileReader fr = new FileReader(fileToRead); // Crea un lettore di file
			BufferedReader br = new BufferedReader(fr); // Crea un buffer di lettura
			String line = br.readLine(); // Leggo la prima riga del file
			
			while (line != null) {
			    Scanner scn = new Scanner(line);
//			    fileRowCounter++;
			    
			    System.out.println("Riga:");
			    System.out.println(line + "\n");
			    
			    for (int i = 0; i < this.numColonne; i++) {
			    	if (!scn.hasNextInt()) {  // Potrebbe non leggerli come int ma come stringhe
			    		scn.close();
			    		return false;
			    	}
			    	
			    	int currentNum = scn.nextInt();
//			    	fileColumnCounter++;
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
