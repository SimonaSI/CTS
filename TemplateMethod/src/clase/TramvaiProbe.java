package clase;

public class TramvaiProbe extends TramvaiAbstract{
    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul a plecat de la capat de linie");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul nu opreste in aceasta statie");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul a ajuns la capat de linie");
    }
}
