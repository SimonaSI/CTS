package ValidatoareTerestre;

public class ValidatorAutobuz implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat bilet pt autobuz");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonament pt autobuz");
    }
}
