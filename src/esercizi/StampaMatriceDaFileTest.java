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
	
	// "INVALID-DATA" in caso di dimensioni incongruenti rispetto a quelle fornite
	@Test
	void invalidDataTest() {
		assertEquals("INVALID-DATA", smdf.stampa("src/files/invalid-data-1.txt", 3, 3));
		assertEquals("INVALID-DATA", smdf.stampa("src/files/invalid-data-2.txt", 3, 3));
	}
	
	// "NOT-NUMERIC-VALUE" in caso di valore non numerico presente nel file
	@Test
	void notNumericValueTest() {
		assertEquals("NOT-NUMERIC-VALUE", smdf.stampa("src/files/not-numeric-value-1.txt", 3, 3));
		assertEquals("NOT-NUMERIC-VALUE", smdf.stampa("src/files/not-numeric-value-2.txt", 3, 3));
	}
	
	// In caso positivo la matrice viene stampata sotto forma di stringa
	@Test
	void stampaTest() {
		String matrixResultStr = "[34, 5, 6],\n" + "[3, 20, 7],\n" + "[1, 0, 8]";
		String matrixResultStr2 = "[345, 65, 2375, 2],\n" + "[4, 64, 23456, 2]";
		assertEquals(matrixResultStr, smdf.stampa("src/files/matrice.txt", 3, 3));
		assertEquals(matrixResultStr2, smdf.stampa("src/files/matrice2.txt", 2, 4));
	}
}
