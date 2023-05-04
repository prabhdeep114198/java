// to check if given number or palindrome or not 
import java.util.* ;
class palindrome{
    int num;
}
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome p = new palindrome();
        int temp, sum=0;
        System.out.println("Enter a number:   ");
        p.num = sc.nextInt();
        temp = p.num;
        while(p.num != 0){
        sum = (sum*10)+ p.num%10 ;
        p.num = p.num/10;
        }
        if(temp == sum){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("non palindrome number ");
        }
    }
}