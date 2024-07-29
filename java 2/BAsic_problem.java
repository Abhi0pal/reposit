import java.util.Arrays;
public class BAsic_problem {

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        // System.out.println(Arrays.toString(arr));
        // swap(arr, 0, 3);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(max_item(arr));
        
        
    }
    static int max_item(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;

    }
    
}
