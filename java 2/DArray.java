import java.util.Scanner;
import java.util.Arrays;

public class DArray {
    public static void main(String[] args) {
        // int[][] arr=new int[3][];
        Scanner st=new Scanner(System.in);
        int[][] arr={
            {1,2,10},
            {4,5,6},
            {7,8,9}
        };

        // lenght of the row
        // System.out.println(arr.length);
        // lenght of the column
        // System.out.println(arr[0].length);
        //now here we take input of the 2-D Array
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         arr[row][col]=st.nextInt();
        //     }
        // }
        //now here we print the arrays
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //          System.out.print(arr[row][col]);
        //     }
        //     System.out.println();
        // }
        
        //this is new method of printing
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    
    }

    
}
