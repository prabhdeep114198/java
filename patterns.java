import java.util.* ;
public class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter a number:   ");
        a = sc.nextInt();
        for(int i=1;i<a;i++){
            for(int j=1;j<a-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}