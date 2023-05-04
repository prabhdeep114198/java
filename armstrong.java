// armstrong numbers in java
import java.util.* ;
import java.math.* ;
public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, temp , i=0,n;
        double res=0;
        System.out.print("enter a number:  ");
        n1 =sc.nextInt();
        n2 = n1;
        temp = n1;
        while(n1 != 0){
            n1 = n1/10;
            i++;
        }
        while(n2 != 0){
            n = n2%10;
            res = res + (Math.pow(n,i)) ;
            n2 = n2/10;
        }
        if(temp == res){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("not an armstrong number");
        }
    }
}