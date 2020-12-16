package entities;

public class Adresse {

    private String Strasse;
    private String Hausnummer;
    private String Postleitzahl;
    private String Ort;

    public Adresse(String strasse, String hausnummer, String postleitzahl, String ort){
        this.Strasse = strasse;
        this.Hausnummer =hausnummer;
        this.Postleitzahl = postleitzahl;
        this.Ort = ort;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStraße(String strasse) {
        Strasse = strasse;
    }

    public String getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        Hausnummer = hausnummer;
    }

    public String getPostleitzahl() {
        return Postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        Postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

}
