/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating 
a class named 'Triangle' with constructor having the three sides as its parameters.*/
import java.util.* ;
class triangle{
    int side1;
    int side2;
    int  side3;
    triangle(){

    }
    void trangle(int a,int b,int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }
    triangle set(triangle m){
        triangle t = new triangle();
        t.side1 = m.side1;
        t.side2 = m.side2;
        t.side3 = m.side3;
        return t;
    }
    void gets(){
        System.out.println("area is :"+0.5*(side2*side3));
        System.out.println("area is :"+side1+side2+side3);
    }
}
public class code03{
    public static void main(String[] args) {
        triangle m = new triangle(3,4,5);
        m.gets();
    }
}