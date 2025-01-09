package esercizi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StampaMatriceDaFileTest {

	StampaMatriceDaFile smdf;

	@BeforeEach
	void setUp() throws Exception {
		smdf = new StampaMatriceDaFile();
	}
	
	// "INVALID-FILE-NAME" se non viene trovato il file con il nome fornito
	@Test
	void invalidFileNameTest() {
		assertEquals("INVALID-FILE-NAME", smdf.stampa("src/files/my-matrix.txt", 3, 3));
	}
	
	//TODO  ->  "INVALID-DATA" in caso di dimensioni incongruenti rispetto a quelle fornite
	@Test
	void invalidDataTest() {
		assertEquals("INVALID-DATA", smdf.stampa("src/files/invalid-data-1.txt", 3, 3));
		assertEquals("INVALID-DATA", smdf.stampa("src/files/invalid-data-2.txt", 3, 3)); //bug: Da problemi questo file
	}
	
	//TODO  ->  "NOT-NUMERIC-VALUE" in caso di valore non numerico presente nel file
	//TODO  ->  In caso positivo la matrice viene stampata sotto forma di stringa

}
