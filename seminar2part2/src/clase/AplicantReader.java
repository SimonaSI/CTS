package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader implements Reader{
    protected Scanner scanner;

    public AplicantReader(String numeFisier) {
        try {
            scanner = new Scanner (new File(numeFisier));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        Integer varsta = scanner.nextInt();
        Integer punctaj = scanner.nextInt();
        Integer nr = scanner.nextInt();
        String[] vect = new String[nr];
        for (Integer i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiect(nr, vect);
    }
}
