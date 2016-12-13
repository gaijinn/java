package Pratybos;

/**
 * Created by Marius on 12/9/2016.
 */
public class Zuvis {
    private String pavadinimas;
    private int svoris;

    public Zuvis(String pavadinimas, int svoris) {
        this.pavadinimas = pavadinimas;
        this.svoris = svoris;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    @Override
    public String toString() {
        return "Zuvis{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", svoris=" + svoris +
                '}';
    }
}
