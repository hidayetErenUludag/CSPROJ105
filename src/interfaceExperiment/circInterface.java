package interfaceExperiment;

import java.util.Scanner;

class circInterface implements interfaceTest{
    double pi = 3.1415;
     Scanner sc = new Scanner(System.in);
     @Override
     public double area() {
         System.out.println("Enter a radius");
         int radius = sc.nextInt();
         return  pi*radius*radius;
     }

    @Override
    public double surfaceArea() {
        System.out.println("Enter a radius");
        int radius = sc.nextInt();
        return 2*pi*radius;
    }
}
