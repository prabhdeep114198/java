import java.util.* ;
public class array14{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int arr[],n,temp;
System.out.print("enter value for n:   ");
n = sc.nextInt();
arr = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
temp = arr[0];
for(int j=0; j<n-1;j++){
	arr[j] = arr[j+1];
}
arr[n-1] = temp;
for(int j=0; j<n;j++){
System.out.print(arr[j]);}
}}