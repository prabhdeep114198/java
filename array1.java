// arrays declare initialize and print elements of an array
// find avg of numbers in array
// addition of 2 matrices ;
import java.util.* ;
public class array1{
public static void main(String[] args){
	int[] arr;
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the size of array:   ");
	n = sc.nextInt();
	arr = new int[n];
	for(int i = 0; i<n;i++){
		arr[i] = sc.nextInt();
	}
	System.out.print("the array is :\n");
	for(int i = 0; i<n;i++){
		System.out.print(+arr[i]+ " ");}

}}