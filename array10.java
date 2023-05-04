
import java.util.*;

class array10{
public static void countFreq(int arr[], int n){
	boolean element[] = new boolean[n];
	Arrays.fill(element, false);
	for (int i = 0; i < n; i++) {
		if (element[i] == true)
			continue;
		int count = 1;
		for (int j = i + 1; j < n; j++) {
			if (arr[i] == arr[j]) {
				element[j] = true;
				count++;
			}
		}
		System.out.println(arr[i] + " " + count);
	}
}
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int m;
	System.out.print("enter value for m:   ");
	m = sc.nextInt();
	int arr[] = new int[m];
	for(int i=0;i<m;i++){
		arr[i] = sc.nextInt();}
	int n = arr.length;
	countFreq(arr, n);
}
}

