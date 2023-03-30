public class radious{
    double pi = 3.1415;
     public void radiusCalc(int radius){
         if (radius <= 0){
             radius = 1;
         }
         double area = radius*radius*pi;
         double circumference = 2*pi*radius;
         System.out.println("The area is "+ area + " The circumference is " + circumference + " Radius is " + radius);
     }
}

