package pirmoji.paskaita.basic.syntax.Tvarkarastis;

import java.util.Date;

/**
 * Created by Marius on 12/8/2016.
 */
public class Tvarkarastis {

    private String data;
    private String aprasas;

    public Tvarkarastis(String data, String aprasas) {
        this.data = data;
        this.aprasas = aprasas;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getAprasas() {
        return aprasas;
    }

    public void setAprasas(String aprasas) {
        this.aprasas = aprasas;
    }

    @Override
    public String toString() {
        return "Tvarkarastis{" +
                "data=" + data +
                ", aprasas='" + aprasas + '\'' +
                '}';
    }
}
