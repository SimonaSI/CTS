package clase;

public class TroleibuzHandler extends TransportHandler{
    public TroleibuzHandler(Integer pragDistanta) {
        super(pragDistanta);
    }

    @Override
    public void deplaseazaRequest(Integer distanta) {
        if (distanta < super.pragDistanta) {
            System.out.println("Merge cu troleibuzul");
        }
        else {
            transportHandler.deplaseazaRequest(distanta);
        }
    }
}
