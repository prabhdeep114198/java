import java.util.* ;
public class arr4{
    public static void main(String[] args){
        int[][] array1 ;
        int[][] array2 ;
        int[][] array3 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements:  ");
        int n = sc.nextInt();
        array1 = new int[n][n];
        array2 = new int[n][n];
        array3 = new int[n][n];
        System.out.print("please fill elements of array1:  ");
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.print("2nd array  :\n");
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
               array2[i][j] = sc.nextInt();
            }
        }
        System.out.print("multiplication of 2 arrays are :\n");
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
                array3[i][j]=0;
                    for(int k=0;k<n;k++){
               array3[i][j] += array2[i][j] * array1[j][i];
               }
           }
       }
       for (int i = 0 ; i<n; i++){
            for (int j = 0; j<n ; j++){
                System.out.print(array3[i][j]+ "  ");
            }
            System.out.print("\n");
        }
    }
}
