import java.util.Arrays ;
public class jagged {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[] {1,2,3,4};
        arr[1] = new int[] {5,6};
        arr[2] = new int[] {7,8,9};
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
