package Main;

import Builder.Autobuz;
import Builder.AutobuzBuilder;
import Builder.AutobuzBuilderV2;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz;
        AutobuzBuilder builder = new AutobuzBuilder();
        autobuz = builder.build();

        Autobuz autobuz1;
        AutobuzBuilder builder1 = new AutobuzBuilder();
        autobuz1 = builder1.setNumeSofer("Vasile").build();

        Autobuz autobuz2;
        AutobuzBuilder builder2 = new AutobuzBuilder();
        autobuz2 = builder2.setModel("america").setNew(false).build();

        System.out.println(autobuz);
        System.out.println(autobuz1);
        System.out.println(autobuz2);

        AutobuzBuilderV2 autobuzBuilderV2 = new AutobuzBuilderV2();
        Autobuz a1 = autobuzBuilderV2.setStop(true).setOpenDoors(true).setText("La multi ani").build();
        Autobuz a2 = autobuzBuilderV2.setNumeSofer("Mihai").build();
        Autobuz a3 = autobuzBuilderV2.build();

        System.out.println("Noile autobuze");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
