import java.util.* ;
public class arr8{
public static void main(String[] args){
	int[] arr;
	int n,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the size of array:   ");
	n = sc.nextInt();
	arr = new int[n];
	for(int i = 0; i<n;i++){
		arr[i] = sc.nextInt();
	}
	for(int i = 0; i<n;i++){
		sum = sum+arr[i];
	}
	System.out.print("sum of array is: "+sum);

}}