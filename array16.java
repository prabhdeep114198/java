import java.util.* ;
public class array16{
    public static void main(String[] args){
        int[][] array1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements:  ");
        int n = sc.nextInt();
        array1 = new int[n][5];
        System.out.print("please fill elements of array1:  ");
        for (int i = 0 ; i<n; i++){
            for (int j = 0; j<5 ; j++){
                array1[i][j] = sc.nextInt();
            }
            System.out.println("student number "+i);
        }
        int sum=0,avg=0;
        for (int i = 0 ; i<n; i++){
            sum =0;
            for (int j = 0; j<5 ; j++){
                sum = sum +array1[i][j];
                avg = sum/5;
            }
            System.out.println("Average of student "+i+ " is "+avg);
        }
    }
}
