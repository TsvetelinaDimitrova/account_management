package Kontoverwaltung;

abstract public class Konto implements Kontomethoden {
// Deklaration der Variablen
    private String iban;
    private Kunde kontoInhaber;
    private double kontostand;
    
// Definition Konstruktor
    public Konto(String iban, String vorname, String nachname, double kontostand){
        this.iban = iban;
        kontoInhaber = new Kunde(vorname, nachname);
        this.kontostand = kontostand;
    }
    
    /**public Konto(double kontostand, String vorname, String nachname, String iban){
        this.iban = iban;
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontostand = kontostand;
    }
    */
    public Konto(){
        
    }
    
//Getter-/Setter-Methoden
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public Kunde getKontoInhaber() {
        return kontoInhaber;
    }

    public void setKontoInhaber(Kunde kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }
    
//Definition Methoden
    public void einzahlen(double betrag){
    this.kontostand = this.kontostand + betrag;
    // kontostand += betrag
    }
    
    public void auszahlen (double betrag){
        kontostand -=betrag;
        // kontostand = kontostand - betrag
    }
    
    /** Ausgabe wird zu einer abstrakten Methode, um die Subklasse zu zwingen,
    * diese Methode zu implementieren, d.h. zu überschreiben.
    * Bei einer abstrakten Methode wird nur der Methodenkopf definiert.
    * Besonderheit: Definition eine abstrakten Methode ist eine Anweisung, somit
    * muss hier ein ; ans Ende.
    * Eine Klasse die eine abstrakte enthällt, ist eine abstrakte Klasse und 
    * muss auch so definiert werden.
    */
    public abstract void ausgabe();
    
    /** public static void help(){
        System.out.println("Hilfe");
    }
    */
}
