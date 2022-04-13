package clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost platita suma de " + suma + " prin sms");
    }
}
