import java.util.Scanner;

class Circle{

    double radius;

    Circle(){
        radius = 12;
    }

    Circle(double radius){
        this.radius = radius;
    }

    // Area of the circle.
    public double areaOfCircle(){
        double areaCircle = Math.PI*Math.pow(radius,2);
        return areaCircle;
    }

    //circumference of the circle.
    public double circumferenceOfCircle(){
        double areaCircle = 2*Math.PI*radius;
        return areaCircle;
    }

    public void display(){
        System.out.println("Area of circle is : " + areaOfCircle());
        System.out.println("circumference of the circle is : "+ circumferenceOfCircle());
    }

}
class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        Circle circle1 = new Circle(input.nextDouble());

        // display Area and circumference is circle  using User-defined Radius
        System.out.println("Area and circumference is circle  using User-defined Radius : ");
        circle1.display();

        // display "Area and circumference is circle by default : "
        Circle circle2 = new Circle();
        System.out.println("Area and circumference is circle by default : ");
         circle2.display();
    }
}