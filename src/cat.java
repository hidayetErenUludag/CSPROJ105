public class cat extends Animal {
    private int numLives;

    public cat(String name, int numLives) {
        super(name);
        this.numLives = numLives;
    }

    public void printNumLives() {
        System.out.println("I have " + this.numLives + " lives");
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("I'm a cat");
    }
}
