
package assignment8;

public class AreaClass{
  
    public static double circles(double radius){
        return Math.PI * radius * radius;
    }
    
    public static double rectangle(double length, double width){
        return length * width;
    }
    
    
    public static double cylinders(double radius, double height){
        return Math.PI * radius * radius * height;
    }
    
}