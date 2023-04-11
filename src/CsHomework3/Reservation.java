package CsHomework3;

public class Reservation {
    private final String reservationNumber;
    private final int dayCount;;
    public Reservation(int dayCount){
        double reservationNum = Math.random()*((1000-10000)+1);
        this.reservationNumber = String.valueOf(reservationNum);
        this.dayCount = dayCount;
    }
}
