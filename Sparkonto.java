package Kontoverwaltung;

public class Sparkonto extends Konto{
    private double sparzins;
    
    public Sparkonto(String iban, double kontostand, String vorname,
            String nachname, double sparzins){
        super(iban, vorname, nachname, kontostand);
        this.sparzins = sparzins;
        
    }

    public double getSparzins() {
        return sparzins;
    }

    public void setSparzins(double sparzins) {
        this.sparzins = sparzins;
    }

    @Override
    public String toString() {
        return "Sparkonto{" + "sparzins=" + sparzins + '}';
    }

    @Override
    public void ausgabe() {
        System.out.println("ich bin von der Klasse Sparkonto"); 
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
