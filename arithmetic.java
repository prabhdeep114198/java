import java.util.* ;
public class arithmetic{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter a number a:  ");
int a = sc.nextInt();
System.out.print("enter a number b:  ");
int b = sc.nextInt();
int sum = a+b;
int prod = a*b;
float div = a/b;
int sub = a -b;
System.out.println("Sum is " +sum);
System.out.println("Product is " +prod);
System.out.println("div is " +div);
System.out.println("Subtraction is " +sub);

}}