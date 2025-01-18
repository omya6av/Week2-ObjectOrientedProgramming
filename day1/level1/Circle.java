class Circle{

    double radius;

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

        Circle circle1 = new Circle(3);

        circle1.areaOfCircle();
        circle1.circumferenceOfCircle();
        circle1.display();
    }
}