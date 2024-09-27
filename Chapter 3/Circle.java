public class Circle {
    
    private static double radius;      
    private static double diameter;     
    private static double area;         

    
    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

   
    public static void setRadius(double newRadius) {  
        radius = newRadius;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    
    public static double getRadius() {
        return radius;
    }

    
    public static double getDiameter() {
        return diameter;
    }

   
    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {
        
        Circle firstCircle = new Circle();  
        Circle secondCircle = new Circle(); 
        Circle thirdCircle = new Circle();  

        
        firstCircle.setRadius(3);
        System.out.println("Radius of the first circle: " + firstCircle.getRadius());
        System.out.println("Diameter of the first circle: " + firstCircle.getDiameter());
        System.out.println("Area of the first circle: " + firstCircle.getArea());

        
        secondCircle.setRadius(20);
        System.out.println("Radius of the second circle: " + secondCircle.getRadius());
        System.out.println("Diameter of the second circle: " + secondCircle.getDiameter());
        System.out.println("Area of the second circle: " + secondCircle.getArea());
    }
}
