import java.util.* ;
public class array21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.println("enter value for k:  ");
        k = sc.nextInt();
        int[] array = new int[k];
        for(int i =0; i<k;i++){
            array[i] = sc.nextInt();
        }
        int max = 0;
        int max2 =0;
        for(int i=0;i<k;i++){
            if(array[i] > max){
                max2 = max;
            max = array[i];}
            else if(array[i] > max2 ){
                max2 = array[i];
            }
        }
        System.out.println("second max number is "+max2);

    }
}
