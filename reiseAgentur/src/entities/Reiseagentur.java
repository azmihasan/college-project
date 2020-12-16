package entities;

import util.Settings;

import java.util.ArrayList;
import java.util.List;

public class Reiseagentur {

    private String Name;
    private String IDR;
    private Adresse adresse;
    private Kunde kunden[];

    public Reiseagentur(String name, String IDR){
        this.Name = name;
        this.IDR = IDR;
        this.kunden = new Kunde[Settings.MAX_KUNDEN];
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIDR() {
        return IDR;
    }

    public void setIDR(String IDR) {
        this.IDR = IDR;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Kunde[] getKunden() {
        return this.kunden;
    }

    public boolean addKunden(Kunde kunde) {
        for(int i = 0; i < this.kunden.length; i++){
            if(this.kunden[i]==null){
                this.kunden[i] = kunde;
                return true;
            }
        }
       return false;
    }

    public Kunde [] searchKunde(String name){
        List<Kunde> matchKunden = new ArrayList<>();

        for(Kunde kunde : kunden){
            if(kunde != null && kunde.getName().toLowerCase().contains(name.toLowerCase()));
            matchKunden.add(kunde);
        }
        return matchKunden.toArray(new Kunde[] {});
    }

    public Reservierung reservierungSuchen(String reservierungsnummer){

        for(Kunde kunde : this.kunden){
            if(kunde != null){
                for(Reservierung reservierung : kunde.getReservierungen())
                    if(reservierung != null && reservierung.getReservierungsnummer().compareToIgnoreCase(reservierungsnummer)==0)
                    return reservierung;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Reiseagentur [");
        if (this.Name != null) {
            builder.append(this.Name);
            builder.append("\n");
        }
        if (this.IDR != null) {
            builder.append(this.IDR);
            builder.append("\n");
        }
        if (this.adresse != null) {
            builder.append(this.adresse);
            builder.append("\n");
        }

        if (this.kunden != null) {
            builder.append("kunden:\n");
            for (Kunde kunde : this.kunden)
                if (kunde != null)
                    builder.append(kunde + "\n");
        }
        builder.append("]");
        return builder.toString();

    }


}
