// Last updated: 7/9/2026, 3:11:32 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        char[] ch =s.toCharArray();
        for(char c:ch){
            if(c=='(' || c =='[' || c=='{'){
               stack.push(c);
            }else{
                if(stack.empty()) return false;
                else if(c==')' && stack.peek()=='(') stack.pop();
                else if(c==']' && stack.peek()=='[') stack.pop();
                else if(c=='}' && stack.peek()=='{') stack.pop();
                else return false;
            }
        }
        return stack.empty();
    }
}