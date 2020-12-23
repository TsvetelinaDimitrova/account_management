package Kontoverwaltung;

public class GirokontoPlus extends Girokonto 
        implements Kontomethoden, Kontomethoden2{
    private double guthabenzins;
    public GirokontoPlus(String iban, String vorname, String nachname, 
            double guthabenzins){
        super(iban, 0.0, 200.00, vorname, nachname);
        this.guthabenzins = guthabenzins;
    }

    public double getGuthabenzins() {
        return guthabenzins;
    }

    public void setGuthabenzins(double guthabenzins) {
        this.guthabenzins = guthabenzins;
    }
    
    @Override
    public void ausgabe(){
        System.out.println("Ich bin von der Klasse GirokontoPlus");
    }

    @Override
    public String toString() {
        return "GirokontoPlus{" + "guthabenzins=" + guthabenzins + '}';
    }

    @Override
    public double zinsberechnung() {
        System.err.println("GirokontoPlus Methode zinsberechnung");
        return 0.0;
    }

    @Override
    public void ausgabeKontoeigenschaften() {
        System.err.println("GirokontoPlus Methode ausgabeKontoeingenschaften");
    }

    @Override
    public void testausgabe() {
        System.err.println("GirokontoPlus Meth: testausgabe");
    }
    
    
}
