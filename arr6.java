// index of an array at particular element 
import java.util.* ;
public class arr6{
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
	System.out.print("enter the element you want :  ");
	int num = sc.nextInt();
	for(int i = 0; i<n;i++){
		if(num == arr[i]){
		System.out.print("index is "+i);}
    }
}}