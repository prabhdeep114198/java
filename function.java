// INHERITANCE IN JAVA
import java.util.* ;
class sides{
    int side;
}
class colour extends sides{
    String color;
}
class dimention extends colour{
    int dim;  // either 2d or 3d
    String b;
    public void printinfo(){
        System.out.println("color = "+this.color+"\nshape = "+this.b+"\ndimention = "+this.dim);
    }
}
public class function{
    public static void main(String[] args){
        int a ;
        Scanner sc = new Scanner(System.in);
        dimention dm = new dimention();
        System.out.print("enter number of sides of shape:   ");
        dm.side = sc.nextInt();
        System.out.println("enter dimention of shape:    ");
        dm.dim = sc.nextInt();
        System.out.println("enter the colour of the shape:    ");
        dm.color = sc.nextLine();
        
        a = dm.side;

        switch (a) {
            case 1:{
                dm.b = "point";
                dm.printinfo();
            }
                break;
            case 2:{
                dm.b = "line";
                dm.printinfo();
                }
                break;
            case 3 : {
                dm.b = "triangle";
                dm.printinfo();
            }
            break;
            case 4 :{
                dm.b = "square / rectangle ";
                dm.printinfo();
            }
            break;
            case 5:{
                dm.b = "pentagon";
                dm.printinfo();
            }
            break;
            case 6:{
                dm.b = "hexagon";
                dm.printinfo();
            }
            break;
            case 7:{
                dm.b="heptagon";
                dm.printinfo();
            }
            break;
            case 8:{
                dm.b ="octagon";
                dm.printinfo();
            }
            break;
            default:{
                System.out.println("enter a valid number from 1 to 8");
            }
                break;
        }
   }
}