package clase;

public class Program {

    public static void main(String[] args) {
        SoferAutobuz soferAutobuz = SoferAutobuz.getInstance("Nume1");
        SoferAutobuz soferAutobuz1 = SoferAutobuz.getInstance("Nume2");

        System.out.println(soferAutobuz.getNume());
        System.out.println(soferAutobuz1.getNume());
    }
}
