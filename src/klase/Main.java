package klase;

public class Main {
    public static void main(String[] args) {
//        Sektori sektor1 = new Sektori("Tech team", "Pera Peric", 30);
//        Sektori sektor2 = new Sektori();

        Sektori sektor1 = new Sektori();
        sektor1.setNazivSektora("Naziv");
        sektor1.setTeamLead("Teamlead");
        sektor1.setBrojLjudi(100);

        System.out.println(sektor1.getBrojLjudi());
        System.out.println(sektor1.getTeamLead());
        System.out.println(sektor1.getNazivSektora());







        //AKO KONSTRUKTOR NIJE DEFINISAN, VRATICE NAM REFERENTNI BROJ OBJEKTA - REFERENCU
//        System.out.println(sektor1);
//
//        //POZIVAMO METODU SUM
//        sektor1.sum(5,5);
//
//        //PRINTAMO REZULTAT METODE SUM
//        System.out.println(sektor1.sum(5,5));
//
//        //VOID METODA
//        sektor1.sum2(5,5);

    }
}
