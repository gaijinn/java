package generics.database.connection;


import generics.database.connection.genericsSimple.*;

import java.util.Collections;

public class Pagrindine {


    public static void main(String[] args) {

        Vaisius <Lapavaisis> vaisius = new Vaisius<>();

        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));

        Collections.sort(vaisius.getLapavaisiai(), new Vaisius<>());

        for (Lapavaisis ll: vaisius.getLapavaisiai()) {
            System.out.println(ll);
        }

        //Vaisius<Citrusinis> citrusinisVaisius = new Vaisius<>();






    }
}
