// even and odd of an array
import java.util.* ;
public class arr7{
public static void main(String[] args){
	int[] arr;
	int n,j=0,m=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the size of array:   ");
	n = sc.nextInt();
	arr = new int[n];
	for(int i = 0; i<n;i++){
		arr[i] = sc.nextInt();
	}
	for(int i = 0; i<n;i++){
		if(arr[i]%2 == 0){
			j++;
	}
	if(arr[i]%2 != 0){
		m++;
    }

}
System.out.println("even numbers are "+j);
System.out.println("odd numbers are "+m);
}
}