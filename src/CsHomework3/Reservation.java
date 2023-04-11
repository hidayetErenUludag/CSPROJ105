package CsHomework3;

import java.util.Random;

public class Reservation {
    private final String reservationNumber;
    private final int dayCount;;
    public Reservation(int dayCount){
        Random reservationNum = new Random();
        reservationNum.nextInt(1000,9999);
        this.reservationNumber = String.valueOf(reservationNum);
        this.dayCount = dayCount;
    }

    public int getDayCount() {
        return dayCount;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }
}
