public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My name is " + this.name);
    }
}

