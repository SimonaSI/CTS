package clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost platita suma de " + suma + " prin card de calatorii");
    }
}
