package clase;

public abstract class TransportHandler {
    protected TransportHandler transportHandler;
    protected Integer pragDistanta;

    public void setHandler(TransportHandler transportHandler) {
        this.transportHandler = transportHandler;
    }

    public abstract void deplaseazaRequest(Integer distanta);

    public TransportHandler(Integer pragDistanta) {
        this.transportHandler = null;
        this.pragDistanta = pragDistanta;
    }
}
