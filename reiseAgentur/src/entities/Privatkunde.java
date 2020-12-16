package entities;

public class Privatkunde extends Kunde {

    private Bezahlmethode[] bezahlMethoden;

    public Privatkunde(Anrede anrede, String vorname, String nachname){
        super(anrede, vorname, nachname);
        this.bezahlMethoden = new Bezahlmethode[3];
    }

    public String getName() {return super.getNachname() + " " + super.getNachname(); }

    public Bezahlmethode[] getBezahlMethoden() { return this.bezahlMethoden; }

}
