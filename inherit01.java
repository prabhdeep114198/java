import java.util.* ;
class circle{
    double rad;
    
}
class cylinder extends circle{
    double height;
    double calcarea(){
        return 3.14*rad*rad;
    }
    double calcvol(){
        return 3.14*rad*rad*height;
    }
}
public class inherit01{
    public static void main(String[] args) {
        double area, volume;
        Scanner sc = new Scanner(System.in);
        cylinder cy = new cylinder();
        System.out.print("enter the radiud of circle :   ");
        cy.rad = sc.nextDouble();
        System.out.print("enter the height of cylinder :   ");
        cy.height = sc.nextDouble();
        area = cy.calcarea();
        volume = cy.calcvol();
        System.out.println("area of circle is "+area);
        System.out.println("volume of cylinder is "+volume);
        
    }
}
