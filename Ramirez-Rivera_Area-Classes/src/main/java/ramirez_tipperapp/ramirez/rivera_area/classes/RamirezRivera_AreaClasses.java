/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez.rivera_area.classes;

/**
 *
 * @author angelramirez-rivera
 */
public class RamirezRivera_AreaClasses {
    
   public class Area {

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate the area of a rectangle
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // Calculate the area of a cylinder
    public static double calculateCylinderArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
  }
    
    public static void main(String[] args) {
        
        double circleArea = Area.calculateCircleArea(5.0); // Radius of the circle
        double rectangleArea = Area.calculateRectangleArea(4.0, 6.0); // Width and height of the rectangle
        double cylinderArea = Area.calculateCylinderArea(3.0, 8.0); // Radius of the base and height of the cylinder

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the cylinder: " + cylinderArea);
    }   
}

