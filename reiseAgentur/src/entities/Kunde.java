package entities;

import java.util.Date;

public abstract class Kunde {

    private long Kundennummer;
    private Anrede anrede;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Adresse adresse;
    private String telefonnummer;
    private String email;
    private Reservierung[] reservierungen;

    public Kunde(Anrede anrede, String vorname, String nachname){
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public abstract String getName();

    public abstract Bezahlmethode[] getBezahlMethoden();

    public long getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(long kundennummer) {
        Kundennummer = kundennummer;
    }

    public Anrede getAnrede() {
        return anrede;
    }

    public void setAnrede(Anrede anrede) {
        this.anrede = anrede;
    }

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

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reservierung[] getReservierungen() { return this.reservierungen; }

    public boolean addReservierung(Reservierung reservierung) {
        for(int i = 0; i < this.reservierungen.length;i++){
            if(this.reservierungen[i] == null){
                this.reservierungen[i] = reservierung;
            }
        }
        return false;
    }

    public String toString(){return this.vorname +" "+ this.nachname; }
}
