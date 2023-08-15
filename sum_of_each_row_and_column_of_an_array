import java.util.* ;
public class array17{
    public static void main(String[] args){
        int[][] array1 ;
        Scanner sc = new Scanner(System.in);
        array1 = new int[4][5];
        int c=1;  
        int rows, cols, sumRow=0, sumCol=0;  
        System.out.print("please fill elements of array1:  ");
        for (int i = 0 ; i<4; i++){
            System.out.println("sales person "+c);
            for (int j = 0; j<5 ; j++){
                array1[i][j] = sc.nextInt();
            }
            c=c+i;
        }
         rows = array1.length;    
        cols = array1[0].length;  
        
        System.out.println("product"+"\t"+"1\t 2\t 3\t 4\t 5\t Total");
        for (int i = 0 ; i<4; i++){
            System.out.print("person"+i);
            for (int j = 0; j<5 ; j++){
                System.out.print("\t"+array1[i][j]);
            }
            System.out.print("\n");
        }
         for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + array1[i][j];    
            }    
            System.out.println(sumRow);    
        }    
             
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + array1[j][i];    
            }    
            System.out.print(sumCol+"\t");    
        }    

    }
}
