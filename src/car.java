public class car extends Vehicle {
    public car() {
        this(1300);
        System.out.println("B1");
    }

    public car(int power) {
        System.out.println("B2");
    }
}