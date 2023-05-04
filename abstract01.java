/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three
 abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter 
 each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of
  'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 
  'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object
   of class 'Area' and call all the three methods.*/
   import java.util.*;
abstract class shape{
    abstract void RectangleArea(double a, double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}
class Area extends shape{
    double area =0;
    void RectangleArea(double a, double b){
        area = a*b;
        System.out.println("area of rectangle is "+area);
    }
    void SquareArea(double s){
        area = s*s;
        System.out.println("area of square is "+area);
    }

    void CircleArea(double r){
        area = 3.14*r*r;
        System.out.println("area of square is "+area);
    }
    
}

public class abstract01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area aa = new Area();
        Double m,n;
        System.out.println("enter value for m:  ");
        m = sc.nextDouble();
        System.out.println("enter value for n:  ");
        n = sc.nextDouble();
        aa.RectangleArea(m,n);
        aa.SquareArea(m);
        aa.CircleArea(n);

    }
}