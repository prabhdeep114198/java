/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
creating a class named 'Triangle' without any parameter in its constructor. */
import java.util.* ;
class triangle{
    int a;
    int b;
    int c;
    public void area(int b, int c){
        double areaa;
        areaa = 0.5*(b*c);
        System.out.println("Area = "+areaa);
    }
    public void perimeter(int a, int b , int c){
        double perimeter;
        perimeter = a+b+c ;
        System.out.println("Perimeter = "+perimeter);
    }
}
public class code02{
    public static void main(String[] args) {
        triangle t = new triangle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        t.area(t.b, t.c);
        t.perimeter(t.a, t.b, t.c);
    }
}