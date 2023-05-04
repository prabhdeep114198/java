import java.util.*;
import java.io.* ;
class ArithmeticCal{
    Double a,b;
    ArithmeticCal(Double m, Double n){
        this.a = m;
        this.b = n;
    }
    
	double subtract(){
	return a-b;
	}

	double add(){
      return a+b;

      }
   double multiply(){
     return a*b;
   }
   double divide(){
   return a/b;
   }
   }

   public class abstract05{
   	public static void main(String args[]){
   		Scanner s = new Scanner(System.in);
       Double m,n, result;
       System.out.print("a = ");
        m = s.nextDouble();
        System.out.print("b = ");
        n= s.nextDouble();
        ArithmeticCal ac = new ArithmeticCal(m,n);
        result = ac.add();
        System.out.println("a + b = " + result);
        result = ac.subtract();
        System.out.println("a - b = " + result);
        result = ac.multiply();
        System.out.println("a * b = " + result);
        result = ac.divide();
        System.out.println("a / b = " + result);
   	}
   }