package clase;

public class AutobuzHandler extends TransportHandler{
    public AutobuzHandler(Integer pragDistanta) {
        super(pragDistanta);
    }

    @Override
    public void deplaseazaRequest(Integer distanta) {
        if (distanta < super.pragDistanta) {
            System.out.println("Merge cu autobuzul");
        }
        else {
            transportHandler.deplaseazaRequest(distanta);
        }
    }
}
