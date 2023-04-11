package CsHomework3;

public class carPark {
    private double dayCount;
    private final double dailyAmount = 300;
    private final Vehicle[] parkingSlot;
    private  String[] Reservations;

    public carPark(String name, int space) {
        parkingSlot = new Vehicle[space];
        Reservations = new String[space];
    }

    public boolean addVehicle(Vehicle vehicle) {
        int filledCount = 0;
        for (Vehicle c : parkingSlot) {
            if (c != null) {
                filledCount += 1;
            }
        }
        if (filledCount >= parkingSlot.length) {
            return false;
        } else {
            parkingSlot[filledCount] = vehicle;
            return true;
        }
    }

    public void makeReservation(Vehicle vehicle, Person person, Reservation dayCount) {
        this.dayCount = dayCount.getDayCount();
        int whereToPlace = -1;
        for (int i = 0; i < Reservations.length; i++) {
            if (Reservations[i] == null) {
                whereToPlace = i;
                break;
            }
        }

        if (whereToPlace != -1) {
            String reservation;
            if (vehicle instanceof Car) {
                reservation = "Res:[" + dayCount.getReservationNumber() + ", " + dayCount.getDayCount() + " days], "
                        + "Driver:[" + person.getName() + "], "
                        + "Vehicle:[" + vehicle.getBrand() + ", " + vehicle.getModel() + ", " + ((Car) vehicle).getSeatCount() + " seats, " + vehicle.getType() + "]";
            } else {
                reservation = "Res:[" + dayCount.getReservationNumber() + ", " + dayCount.getDayCount() + " days], "
                        + "Driver:[" + person.getName() + "], "
                        + "Vehicle:[" + vehicle.getBrand() + ", " + vehicle.getModel() + ", " + vehicle.getType() + "]";
            }

            Reservations[whereToPlace] = reservation; // Update the Reservations array with the new reservation


        }
        else {
            System.out.println("No available slot for reservation.");
        }
    }




    public double computeTotalAmount(){
        double totalAmount = 0.0;
        for (String reservation: Reservations){
            if (reservation != null){
                double amount = this.dailyAmount * dayCount;
                totalAmount += amount;
            }
        }
        return totalAmount;
    }
    public void printRentedVehicles(){
        for(String i:Reservations){
            if (Reservations != null) {
                System.out.println(i);
            }
        }
    }
}
