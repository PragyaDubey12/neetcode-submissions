class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String ch=tokens[i];
            if(ch.equals("+"))
            {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2+n1);
            }
            else if(ch.equals("-"))
            {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2-n1);
            }
            else if(ch.equals("*"))
            {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2*n1);
            }
            else if(ch.equals("/"))
            {
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2/n1);
            }
            else
            {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
