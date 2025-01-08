package esercizi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StampaMatriceDaFileTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	// "INVALID-FILE-NAME" se non viene trovato il file con il nome fornito
	@Test
	void invalidFileNameTest() {
		StampaMatriceDaFile smdf = new StampaMatriceDaFile();
		assertEquals("INVALID-FILE-NAME", smdf.stampa("src/files/my-matrix.txt", 3, 3));
	}
	
	
	//TODO  ->  "INVALID-DATA" in caso di dimensioni incongruenti rispetto a quelle fornite
	//TODO  ->  "NOT-NUMERIC-VALUE" in caso di valore non numerico presente nel file
	//TODO  ->  In caso positivo la matrice viene stampata sotto forma di stringa

}
