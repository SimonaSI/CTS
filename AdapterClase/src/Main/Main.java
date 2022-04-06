package Main;

import Adapter.Adapter;
import ValidatoareTerestre.ValidatorAutobuz;
import ValidatoareTerestre.ValidatorTerestru;

//4. Compania de transport in comun preia si infrastructura de Metrou a orasului si doreste ca biletele sau abonamentele achizitionate
// de catre clienti pentru transportul terestru sa poata fi folosite si pentru transportul subteran. Sisteme software ale celor doua
// moduri de transport sunt diferite si se doreste implementarea unui modul care sa permita utilizareacelor doua sisteme fara a le
// modifica. Modulul implementat trebuie sa se ocupe de validarea biletelor sau si a abonamentelor.

public class Main {

    public static void main(String[] args) {
        ValidatorTerestru validatorTerestru = new ValidatorAutobuz();
        ValidatorTerestru validatorMetrou = new Adapter();

        validatorTerestru.valideazaBilet();
        validatorTerestru.valideazaAbonament();

        validatorMetrou.valideazaBilet();
        validatorMetrou.valideazaAbonament();

    }
}
