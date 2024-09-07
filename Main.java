package lab_exercise;

//Complete program in a single file

public class Main {

 // Base class
 public abstract static class Shape {
     // Abstract method to be implemented by derived classes
     public abstract double area();
     public abstract double perimeter();
     
     @Override
     public String toString() {
         return "Shape with area: " + area() + " and perimeter: " + perimeter();
     }
 }

 // Derived class for Circle
 public static class Circle extends Shape {
     private double radius;
     
     public Circle(double radius) {
         this.radius = radius;
     }
     
     @Override
     public double area() {
         return Math.PI * radius * radius;
     }
     
     @Override
     public double perimeter() {
         return 2 * Math.PI * radius;
     }
     
     @Override
     public String toString() {
         return "Circle with radius: " + radius + ", area: " + area() + ", and perimeter: " + perimeter();
     }
 }

 // Derived class for Rectangle
 public static class Rectangle extends Shape {
     private double width;
     private double height;
     
     public Rectangle(double width, double height) {
         this.width = width;
         this.height = height;
     }
     
     @Override
     public double area() {
         return width * height;
     }
     
     @Override
     public double perimeter() {
         return 2 * (width + height);
     }
     
     @Override
     public String toString() {
         return "Rectangle with width: " + width + ", height: " + height + ", area: " + area() + ", and perimeter: " + perimeter();
     }
 }

 // Main method
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);
     
     System.out.println(circle);
     System.out.println(rectangle);
 }
}
