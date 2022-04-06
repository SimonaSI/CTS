package ValidatoareSubteran;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("A fost validat bilet pt metrou");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonament pt metrou");
    }
}
