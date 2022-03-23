package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    public StudentiReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            readAplicant(scanner,student);
            Integer an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);

        }
        scanner.close();
        return studenti;
    }
}
