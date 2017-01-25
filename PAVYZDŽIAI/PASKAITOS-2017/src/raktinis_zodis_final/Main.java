package raktinis_zodis_final;



public class Main {

    public static void main(String[] args) {

        Parduotuve parduotuve = new Parduotuve("Maxima","Ukmerges g. 250",55);
        Parduotuve parduotuve2 = new Parduotuve("Maxima","Ukmerges g. 250",99);

        parduotuve.getId();
        parduotuve2.getId();
        parduotuve.getSavininkas();
        parduotuve2.getSavininkas();
        System.out.println(Parduotuve.MAGIC);





    }
}
