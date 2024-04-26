import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');

        for(char c : s.toCharArray()){
            if(mapping.containsKey(c)){
                char topElement = stck.isEmpty() ? '#' : stck.pop();
                if(mapping.get(c) != topElement) {
                    return false;
                }
            } else {
                stck.push(c);
            }
        }

        return stck.isEmpty(); 
    }
}
