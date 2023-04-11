package CsHomework3;

public class carparkTest {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        cars[0] = new Car("12 AİC 34", "Medium", "Automatic", "Honda", "Civic", 2021, 5);
        cars[1] = new Car("45 XÜZ 67", "Medium", "Automatic", "Toyota", "Corolla", 2020, 5);
        cars[2] = new Car("78 DEF 90", "Medium", "Automatic", "Ford", "Fusion", 2019, 5);
        cars[3] = new Car("23 GPI 56", "Medium", "Manual", "Chevrolet", "Malibu", 2022, 5);
        cars[4] = new Car("89 JKL 12", "Medium", "Automatic", "Nissan", "Altima", 2020, 5);
        cars[5] = new Car("34 MNK 78", "Medium", "Automatic", "Kia", "Optima", 2018, 5);
        cars[6] = new Car("56 PQÖ 90", "Medium", "Manual", "Hyundai", "Sonata", 2021, 5);
        cars[7] = new Car("12 ETU 47", "Medium", "Automatic", "Mazda", "Mazda3", 2020, 5);
        cars[8] = new Car("45 VVX 67", "Medium", "Automatic", "Subaru", "Impreza", 2019, 5);
        cars[9] = new Car("78 YZH 23", "Medium", "Manual", "Volkswagen", "Jetta", 2022, 5);

        Vehicle[] motors = new motorCycle[4];
        motors[0] = new motorCycle("34 KK 71", "Standard", "Manual", "Honda", "CBF150", 2018, "Motorcycle");
        motors[1] = new motorCycle("56 LL 92", "Premium", "Automatic", "Yamaha", "YZF-R6", 2017, "Motorcycle");
        motors[2] = new motorCycle("56 RR 07", "Economy", "Manual", "Piaggio", "Liberty 150", 2017, "Scooter");
        motors[3] = new motorCycle("78 SS 28", "Economy", "Automatic", "SYM", "Jet 14 125", 2016, "Scooter");

        carPark test = new carPark("Gülhane parı", 5);
        System.out.println(test.addVehicle(cars[1]));
    }
}

