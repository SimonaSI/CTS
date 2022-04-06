package Adapter;

import ValidatoareSubteran.ValidatorMetrou;
import ValidatoareTerestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
