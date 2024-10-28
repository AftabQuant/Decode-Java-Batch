package HashSets;
import java.util.HashSet;

public class Basics{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        // Insert Element In Set
        set.add(10);
        set.add(30);
        set.add(-8);
        set.add(50);
        set.add(45);
        // Print All Elements & Size Of Set
        System.out.println(set+"  Size is: "+set.size());
        // Remove Element
        set.remove(30);
        System.out.println(set+"  Size is: "+set.size());
        // Search Element
        System.out.println(set.contains(10));
        //toArray Method Of Set
        Object[] arr = set.toArray();
        for(Object ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
