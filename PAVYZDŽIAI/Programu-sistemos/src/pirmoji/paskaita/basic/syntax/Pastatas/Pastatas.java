package pirmoji.paskaita.basic.syntax.Pastatas;

import pirmoji.paskaita.basic.syntax.Tvarkarastis.Cele;
import pirmoji.paskaita.basic.syntax.Tvarkarastis.Tvarkarastis;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Marius on 12/8/2016.
 */
public abstract class Pastatas {

    private String pavadinimas;
    private String adresas;
    private ArrayList<Tvarkarastis> tvarkarastis = new ArrayList<>();

    public Pastatas(String pavadinimas, String adresas) {
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
    }
    public abstract void atvaizduotiTvarkarasti(ArrayList<Tvarkarastis> tvarkarastis) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException;

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAdresas() {
        return adresas;
    }

    public ArrayList<Tvarkarastis> getTvarkarastis() {
        return tvarkarastis;
    }

    @Override
    public String toString() {
        return "Pastatas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", adresas='" + adresas + '\'' +
                ", tvarkarastis=" + tvarkarastis +
                '}';
    }
}
