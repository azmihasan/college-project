package entities;

public class Hotelreservierung extends Reservierung{

    private String hotelname;
    private int reisedauer;

    public Hotelreservierung(){

    }

    public String getHotelname() { return this.hotelname;}

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString() + " ");

//		builder.append(this.reisedauer);
//		builder.append(" Tage ");

        if (this.hotelname != null) {
            builder.append("beim ");
            builder.append(this.hotelname);
        }
        return builder.toString(); }
}
