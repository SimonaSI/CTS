package clase;

public class TramvaiHandler extends TransportHandler{
    public TramvaiHandler(Integer pragDistanta) {
        super(pragDistanta);
    }

    @Override
    public void deplaseazaRequest(Integer distanta) {
        if (distanta < super.pragDistanta) {
            System.out.println("Merge cu tramvaiul");
        }
        else {
            transportHandler.deplaseazaRequest(distanta);
        }
    }
}
