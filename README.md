# File Java

## StampaMatriceDaFile

Creare la classe `StampaMatriceDaFile` con relativo JUnit di test `StampaMatriceDaFileTest`.
Nella classe `StampaMatriceDaFile` è contenuto il seguente metodo:

```java
public String stampa(String fileName, int numRighe, int numColonne)
```

### File di input

Codifica manualmente il file `matrice.txt` con valori numerici da leggere:

```txt
34 5 6
3 20 7
1 0 8
```

### Lettura del file e caricamento della matrice

- In caso non venga trovato un file con il nome fornito restituire **"INVALID-FILE-NAME"**
- In caso di dimensioni incongruenti (il numero delle colonne richieste è maggiore di quelle presenti nel file), restituire **"INVALID-DATA"**
- In caso di valore non numerico all'interno del file, restituire **"NOT-NUMERIC-VALUE"**

#### Output

- Stampare la matrice acquisita da file

#### Cose da fare

- Gestire le eccezioni in caso di accesso al file e contenuto del file non numerico.

#### Consigli

- Usare Integer.ParseInt() per convertire i valori numerici
- Strutturare il programma in piccoli metodi specifici

```java
File file = new File("matrice.txt");
FileReader fr = new FileReader(file);

BufferedReader br = new BufferedReader(fr);
// Get in loop lines
line = br.readLine(); // Ahead
while (line != null) {
    scn = new Scanner(line);

    // code...

    line = br.readLine(); // In loop
}
br.close();
```
