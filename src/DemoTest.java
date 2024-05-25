/*import java.util.HashMap;
 
public class DemoTest {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
         
                HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
 
}*/

import java.util.*;    
public class DemoTest { 
    @SuppressWarnings({ "rawtypes", "unchecked" })   
    public static boolean balancedParenthesis(String inputStr) {   
        Stack stack = new Stack();      
        char[] charArray = inputStr.toCharArray();   
        for (int i = 0; i < charArray.length; i++) {   
            char current = charArray[i];   
            if (current == '{' || current == '[' || current == '(') {  
                stack.push(current);   
                continue;   
            }   
            if (stack.isEmpty()) {    
                return false;   
            }   
            char popChar;   
            switch (current) {   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
    }   
    public static void main(String[] args) {   
          
        String inputStr;  
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("Enter input string to check:");   
        inputStr = sc.nextLine();  
        if (balancedParenthesis(inputStr))   
            System.out.println("Input string "+inputStr+" is balanced.");   
        else   
            System.out.println("Input string "+inputStr+" is not balanced.");   
    }   
}  
