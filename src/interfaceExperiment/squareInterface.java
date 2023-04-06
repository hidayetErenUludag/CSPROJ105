package interfaceExperiment;

import java.util.Scanner;

class squareInterface implements interfaceTest{
     Scanner sc = new Scanner(System.in);
     @Override
     public double area() {
         System.out.println("Enter the length of the side");
         int side = sc.nextInt();
         return side * side;
     }

    @Override
    public double surfaceArea() {
        System.out.println("Enter the length of the side");
        int side = sc.nextInt();
        return side * 4;
    }
}
