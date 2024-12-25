package Pattern;

import java.util.HashMap;

public class A {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int freq = map.get(s.charAt(0));
        for(char ch: map.keySet()){
            int val = map.get(ch);
            if(val != freq) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("aabbcc"));
    }
}
