package AdvancedOops;
import java.util.*;

public class DuplicateElement {
    static List<Integer> isDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr) {
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key)>1) ans.add(key);
        }
        return ans;
    }
    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int ele: arr) {
            if(max < ele) {
                smax = max;
                max = ele;
            }
            if(smax < ele && max != ele) smax = ele;
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,3,2};
        System.out.println(secondLargest(arr));
    }
}
