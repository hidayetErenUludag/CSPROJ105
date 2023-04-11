package CsHomework3;

public class carPark {
    private final double dailyAmount = 300;
    private final Vehicle[] parkingSlot;
    private final String[] Reservations;

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
        String[] reservations = new String[10];

        int whereToPlace = -1;
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
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

            reservations[whereToPlace] = reservation; // Place the reservation in the available slot

            // Print out the reservations
            System.out.println("Reservations:");
            for (String i : reservations) {
                if (i != null) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("No available slot for reservation."); // Handle the case when no available slot is found
        }
    }
    public double computeTotalAmount(){
        double totalAmount = 0.0;
        for (String reservation: Reservations){
            if (reservation != null){
                String[] parts = reservation.split(", ");
                String[] daysPart = parts[0].split(" ");
                String[] vehiclePart = parts[2].split("[:\\[,]");

                int days = Integer.parseInt(daysPart[1]);
                double amount = this.dailyAmount * days;
                totalAmount += amount;
            }
        }
        return totalAmount;
    }
    public void printRentedVehicles(){
        for(String i:Reservations){
            System.out.println(i);
        }
    }
}
