import java.util.* ;
class area1{
double a;
public void info(){
System.out.print("area = "+this.a);
}
}
public class area{
public static void main(String[] args) {
	int rad;
	Scanner sc = new Scanner(System.in);
	area1 ar = new area1();
	System.out.print("enter radius:   ");
	rad = sc.nextInt();
	ar.a = 3.14*rad*rad;
	ar.info();
	
}
}