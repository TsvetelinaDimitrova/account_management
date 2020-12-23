package Kontoverwaltung;

public class Kunde {
// Deklaration der Eigeschaften/Attribute
    private String vorname, nachname, strasse, plz, ort;
    
//Konstruktor
    public Kunde(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

//Getter/Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    @Override
    public String toString(){
        String ausgabe;
        ausgabe = "Vorname: "+vorname;
        ausgabe += "\nNachname: "+nachname;
        return ausgabe;
    }
 
}
