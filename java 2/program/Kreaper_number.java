
public class Kreaper_number {

    static boolean kispar(int n) {
        int sq=n*n;
        int count=0;
        while(sq!=0){
            count++;
            sq/=10;
        }
        sq=n*n;
        int sum=0;
        for(int i=1;i<=count;i++){
            int digit=(int)Math.pow(10,i);
            if (digit== n) {
                continue;
            }
    //     
            int left=sq/digit;
            int right=sq%digit;
            sum=left+right;
            if(sum==n){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(kispar(45));
        for(int i=0;i<=100;i++){
            if(kispar(i)==true){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}