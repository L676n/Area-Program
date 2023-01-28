
package assignment8;

import java.util.Scanner;

public class AreaProgram {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        double Cradius;
        double length, width ;
        double CYradius, height;
        
        System.out.println("Enter the radius of the circle: ");
        Cradius = keyboard.nextDouble();
        
        System.out.println("Enter the length and the width of the  of the rectangle: ");
        length = keyboard.nextDouble();
        width = keyboard.nextDouble();
        
        System.out.println("Enter the radius and the height of the cylinders: ");
        CYradius = keyboard.nextDouble();
        height = keyboard.nextDouble();
        
    System.out.printf("The area of a circle with a "
            + "radius of %.2f is %6.2f\n", Cradius, AreaClass.circles(Cradius));

    // Area of a rectangle
    System.out.printf("The area of a rectangle with a "
            + "length of %.2f and a width of %.2f is %6.2f\n", length, width,
            AreaClass.rectangle(length,  width));

    // Area of cylinder
    System.out.printf("The area of a cylinder with a "
            + "radius of %.2f and a height " + "of %.2f is %6.2f\n", CYradius, height,
            AreaClass.cylinders(CYradius, height));
  }
}
    

