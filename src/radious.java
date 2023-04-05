import java.util.Scanner;

public class radious{
    Scanner sc = new Scanner(System.in);
    double pi = 3.1415;
     public void radiusCalc(){
         System.out.println("Please enter a radius");
         int radius  = sc.nextInt();
         if (radius <= 0){
             radius = 1;
         }
         double area = radius * radius*pi;
         double circumference = 2 * pi * radius;
         System.out.println("The area is "+ area + " The circumference is " + circumference + " Radius is " + radius);
     }
}

