package main;

//10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS. Trebuie implementat modulul dintr-un validator
// calatorie care sa permita plata calatoriei printr-una din cele trei metode. Calatorul va decide modul de plata atunci cand se urca in mijlocul
// de transport.

import clase.CardBancar;
import clase.CardCalatorii;
import clase.Sms;
import clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(3, new CardCalatorii());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new Sms());
        validator.platesteCalatorie();

    }
}
