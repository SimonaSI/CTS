package clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements NodAbstract{

    private String model;
    private String producator;
    private Integer nrLocuri;


    public Autobuz(String model, String producator, Integer nrLocuri) {
        this.model = model;
        this.producator = producator;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", producator='").append(producator).append('\'');
        sb.append(", nrLocuri='").append(nrLocuri).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());

    }

    @Override
    public NodAbstract get(int index) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Exceptie");
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Exceptie");
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Exceptie");
    }
}
