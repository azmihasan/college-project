package entities;

public class Bezahlmethode {

    private String Bezeichnung;
    private String Beschreibung;

    public Bezahlmethode(){

    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

}
