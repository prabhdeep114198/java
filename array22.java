// copy 1 array elements into another 
import java.util.* ;
public class array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.println("enter value for k:  ");
        k = sc.nextInt();
        int[][] arr = new int[k][k];
        int[][] arr2 = new int[k][k];
        for(int i=0; i<k;i++){
            for(int j=0;j<k;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<k;i++){
            for(int j=0;j<k;j++){
                arr2[i][j] = arr[i][j];
            }
        }
        for(int i=0; i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

    }
}
