import java.util.ArrayList;
public class Arrayy_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // System.out.println(list.contains(9));
        // list.set(4,0);
        list.add(0,0);
        
        System.out.println(list);

        
    }
    
}
