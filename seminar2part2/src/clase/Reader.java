package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    public List<Aplicant> readAplicanti() throws FileNotFoundException;
}
