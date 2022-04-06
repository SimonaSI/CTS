package Adapter;

import ValidatoareSubteran.ValidatorMetrou;
import ValidatoareSubteran.ValidatorSubteran;
import ValidatoareTerestre.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {

    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }



    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
