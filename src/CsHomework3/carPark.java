package CsHomework3;

public class carPark {
    private Car[] parkingSlot; // Declare as class-level instance variable
    private int[] Reservations;
    public carPark(String name, int space){
        parkingSlot = new Car[space]; // Initialize as an array of Car objects
    }

    public boolean addVehicle(Car car){
        int filledCount = 0;
        for(Car c : parkingSlot){
            if(c != null){
                filledCount += 1;
            }
        }
        if(filledCount >= parkingSlot.length){
            return false; // Parking is full
        } else {
            parkingSlot[filledCount] = car; // Add car object to next available slot
            return true; // Successful addition
        }
    }

    public void makeReservation(Car car, Person person, Reservation dayCount){

    }
}