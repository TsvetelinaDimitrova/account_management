package Kontoverwaltung;

public class Girokonto extends Konto implements Kontomethoden{
// Deklaration der Eigenschaften
    private double disporahmen;
    
//Konstruktor
    public Girokonto(String iban, double kontostand, double disporahmen, 
            String vorname, String nachname){
        super(iban, vorname, nachname, kontostand);
        this.disporahmen = disporahmen;
    }
    
//Getter/Setter
    public double getDisporahmen() {
        return disporahmen;
    }

    public void setDisporahmen(double disporahmen) {
        this.disporahmen = disporahmen;
    }
    
//Andere bzw. weitere Methoden
    @Override
    public void ausgabe(){
        System.out.println("Ich bin von der Klasse Girokonto");
    }
    
    @Override
    public String toString() {
        return "Girokonto{" + "disporahmen=" + disporahmen + '}';
    }

    @Override
    public double zinsberechnung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ausgabeKontoeigenschaften() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
