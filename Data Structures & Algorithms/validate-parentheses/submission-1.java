class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        int l=s.length();
        for (int i=0;i<l;i++)
        {
            char ch1=s.charAt(i);
            if(ch1=='('||ch1=='['||ch1=='{')
            {stack.push(ch1);}
            else{
                if(stack.isEmpty()){return false;}
                char ch2=stack.peek();
                if(ch1==')' && ch2=='(')
                {stack.pop();}
                else if(ch1==']' && ch2=='[')
                {stack.pop();}
                else if(ch1=='}' && ch2=='{')
                {stack.pop();}
                else{return false;}
            }
        }
        return stack.isEmpty();
    }
}
