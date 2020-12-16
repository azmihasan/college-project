package entities;

public class Geschaeftskunde extends Kunde{

    private String firmenname;
    private Bezahlmethode bezahlmethode;

    public Geschaeftskunde(Anrede anrede, String vorname, String nachname, String frimenname) {
        super(anrede, vorname, nachname);

    }

    public String getFirmenname() {
        return this.firmenname;
    }

    public String getName() {
        return super.getVorname() + " " + super.getNachname() + " - " + this.firmenname;
    }

    public void rechnungMitDerPostSchicken() { this.bezahlmethode.setBeschreibung("Post");}

    public void rechnungPerEmailSchicken() {this.bezahlmethode.setBeschreibung("Email");}

    public Bezahlmethode[] getBezahlMethoden() { return new Bezahlmethode[] { this.bezahlmethode}; }
}
