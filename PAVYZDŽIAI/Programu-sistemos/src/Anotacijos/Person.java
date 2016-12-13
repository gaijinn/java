package Anotacijos;

/**
 * Created by Marius on 12/13/2016.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * <h1>Funkcija grąžinanti vardą.</h1>
     * @return name gražinam vardą
     *
     */
    public String getName() {
        return name;
    }

    @Developer("Tomas")
    public void setName(String name) {
        this.name = name;
    }
    @Developer("Paulius")
    public void skaiciuoti(){}
}
