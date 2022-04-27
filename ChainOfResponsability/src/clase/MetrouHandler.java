package clase;

public class MetrouHandler extends TransportHandler{
    public MetrouHandler(Integer pragDistanta) {
        super(pragDistanta);
    }

    @Override
    public void deplaseazaRequest(Integer distanta) {
        System.out.println("Merge metroul");
    }
}
