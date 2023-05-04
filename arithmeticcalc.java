/* function calculator using switch case  */
import java.util.* ;
import java.math.* ;
public class arithmeticcalc{
    public static void main(String[] args){
        int num1 , num2, num3,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1 for sum \n 2 for division\n 3 for subtraction\n 4 for power ");
        a = sc.nextInt();
        switch(a){
            case 1 :{
                System.out.print("enter values for num1, num2, num3:  ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                int sum = num1+num2+num3;
                System.out.print(" sum is "+ sum);
                break;

            }
            case 2:{
                System.out.print("enter values for num1, num2:  ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                float division = num1/num2;
                System.out.print("quotient is " + division);
                break;

            }
            case 3:{
                System.out.print("enter values for num1, num2:  ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int subtract = num1 - num2;
                System.out.print(+num1+ " - "+num2+ " = " +subtract);
                break;

            }
        case 4:{
            System.out.print("enter values for num1 and num2:  ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            double power = Math.pow(num1, num2);
            System.out.print(+num1+ " ^ "+num2+ " = " +power);
                break;}

            default :{
                System.out.print("enter a valid number: ");
                break;
            }
        }
    }

}
