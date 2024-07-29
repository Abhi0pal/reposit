import java.util.Scanner;


public class Gross {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        double basic=st.nextInt();
        double allow=0;
        String grade=st.next();
        if(grade.equals("A")){
            allow=1700;
        }
        else if(grade.equals("B")){
            allow=1500;
        }
        else if(grade.equals("C")){
            allow=1300;
        }
        double HRA=(int)(basic*0.2);
        double DA=(int)(basic*0.5);
        double PF=(int)(basic*0.11);
        double gross=basic+allow+HRA+DA-PF;
        System.out.println("Gross"+(int)(gross));
        
        

        
    }
    
}
