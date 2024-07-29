import java.util.Scanner;
public class totalMarks {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<marks.length;i++){
            marks[i]=st.nextInt();
        }
        int Total=0;
        for(int i=0;i<marks.length;i++){
            Total+=marks[i];
        }
        
        System.out.println("Total Marks"+Total);
        
        //percentage
        float percentage=Total/((float)(n*100))*100;
        System.out.println(percentage);
    }
    
}
