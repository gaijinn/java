package pirmoji.paskaita.basic.syntax.Tvarkarastis;

import javax.swing.*;

/**
 * Created by Marius on 12/8/2016.
 */
public class Cele extends JTextArea{

    private String pavadinimas;
    private String laikas;

    public Cele(String pavadinimas, String laikas) {
        setText(pavadinimas+"\n"+laikas);
        setEditable(false);
        setLineWrap(true);
        this.pavadinimas = pavadinimas;
        this.laikas = laikas;
    }
    @Override
    public String toString() {
        return "Cele{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", laikas='" + laikas + '\'' +
                '}';
    }


}
