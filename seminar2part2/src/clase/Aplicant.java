package clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected Integer varsta;
    protected Integer punctaj;
    protected Integer nrProiecte;
    protected String[] denumireProiect;
    protected static Integer pragPunctaj = 80;

    public void setDenumireProiect(Integer nrProiecte, String[] denumireProiect) {
        this.nrProiecte = nrProiecte;
        denumireProiect = new String[nrProiecte];
        for(int i=0; i<nrProiecte; i++) {
            denumireProiect[i] = denumireProiect[i];

        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void afiseazaStatus() {
        System.out.println("Aplicantul " + nume + " " + prenume + ((punctaj < pragPunctaj) ? " nu " : "") + " a fost acceptat.");
    }


    public void setPunctaj(Integer punctaj) {
        this.punctaj = punctaj;
    }

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public Aplicant() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume= ").append(nume);
        sb.append(", prenume= ").append(prenume);
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        return sb.toString();
    }



    public void afiseazaFinantarePeZi(Integer sumaPeZi) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste " + sumaPeZi + " Euro/zi in proiect.");
    }

}
