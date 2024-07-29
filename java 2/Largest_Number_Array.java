public class Largest_Number_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        int sec_lar=-1;
        for(int i:arr){
            if(i>sec_lar&&i!=max){
                sec_lar = i;
            }
        }
        System.out.println("Largest Number is "+max+" and second largest number is "+sec_lar); 
    }
    
}
