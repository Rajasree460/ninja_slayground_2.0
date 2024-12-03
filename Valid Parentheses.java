import java.util.Stack;
public class Solution{
    public static boolean isValidParenthesis(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')stack.push(ch);
            else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))return false;
            }
        }
        return stack.isEmpty();
    }
}
