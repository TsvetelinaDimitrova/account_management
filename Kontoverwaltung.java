package Kontoverwaltung;

public class Kontoverwaltung {
    public static void main(String[] args) {
    //Instanzieren eines Objektes aus der Klasse Konto
        /** Konto k1 = new Konto();
        * Konto k2 = new Konto();
        * Konto k3 = new Konto("DE83 3902 3923 3293 4222 3533","Tsvetelina",
            * "Dimitrova",1000.00);
        * System.out.println(k3.getKontoInhaber().getVorname()+" 
                    * "+k3.getKontoInhaber().getNachname());
        * System.out.println(k3.getKontoInhaber());
        */
         
        /** Konto.help();
        * k1.setIban("DE81 1991 0000 1333 2232 6323");
        * k2.setIban("DE81 1991 0000 1333 2232 3323");
        */
    //Objektnotation beim Methodenaufruf
        /** k1.einzahlen(22.50);
        * System.out.println("Konto 1: " + k1.getIban()+" "+k1.getKontostand());
        * System.out.println("Konto 2: " + k2.getIban()+" "+k2.getKontostand());
        * System.out.println("Konto 3: " + k3.getIban()+" "+k3.getKontostand());
        */
        /** System.out.println(k1);
        * System.out.println(k2);
        */
    //Initialisieren eines Objektes aus der Klasse Girokonto
        /**Girokonto g1 = new Girokonto ("DE83 3902 3923 3293 4222 3533",100.00,
                * 2000.00,"Tsvetelina","Dimitrova");
        * System.out.println(g1.getKontostand());
        * System.out.println(g1.getKontoInhaber().getNachname());
        */
    //Initialisieren eines Objektes aus der Klasse Girokonto
        GirokontoPlus g1 = new GirokontoPlus("DE83 3902 3923 3293 7222 3533,",
                "Tsvetelina", "Dimitrova", 5.5);
        System.out.println(g1.getKontostand());
        g1.ausgabe();
        Girokonto gi1 = new Girokonto("giro",100.00,200.00, "Daniela", "Nova");
        gi1.ausgabe();
        Sparkonto s1 = 
                new Sparkonto("spar", 200.0, "Tsvetelina","Dimitrova",6.6);
        s1.ausgabe();
    }
}
