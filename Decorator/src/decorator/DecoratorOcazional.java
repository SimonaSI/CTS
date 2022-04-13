package decorator;

import clase.Printer;

public class DecoratorOcazional extends Decorator{
    private String mesaj;

    public DecoratorOcazional(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaMesaj() {
        System.out.println(mesaj);
    }
}
