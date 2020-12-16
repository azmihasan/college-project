package entities;

public abstract class Reservierung {

    private String reservierungsnummer;
    private String datum;
    private double summe;

    public Reservierung(){

    }

    public double getSumme(){ return this.summe; }

    public void setSumme(double summe){ this.summe = summe; }

    public String getReservierungsnummer() { return this.reservierungsnummer; }

    public String getDatum(){
        return this.datum;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.reservierungsnummer);
        builder.append(". ");
        if (this.datum != null) {
            builder.append(this.datum);
            builder.append(", ");
        }
//		builder.append(this.summe);
//		builder.append(" EURO");
        return builder.toString();
    }
}
