import java.util.* ;
public class arr5{
    public static void main(String[] args){
        int[][] array1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements:  ");
        int n = sc.nextInt();
        array1 = new int[n][n];
        System.out.print("please fill elements of array1:  ");
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
                array1[i][j] = sc.nextInt();

            }
        }
        int min = array1[0][0];
        int max = array1[0][0];
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
                if(max < array1[i][j]){
                    max = array1[i][j];
                }
                else if(min > array1[i][j]) {
                    min = array1[i][j];
                    
    }}
}
System.out.println("max is "+max);
    System.out.println("min is "+min);}}

