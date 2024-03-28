import java.util.Stack;
class BalancedParanthesis{
    public static void main(String[] args){
        String str = "()(()";

        if(isBalancedParathesis(str)){
            System.out.println("Yes it a Balanced Parathesis");
        }else{
            System.out.println("No it not a Balanced Parathesis");
        }
    }

    static boolean isBalancedParathesis(String str){
        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);

            if(x=='(' || x=='{' || x=='['){
                st.push(x);
                continue;
            }

            if(st.isEmpty())
                return false;

            char check;
            switch(x){
                case ')': 
                check = st.pop();
                if(check == '{' || check == '[')
                    return false;
                break;
                case ']': 
                check = st.pop();
                if(check == '(' || check == '{')
                    return false;
                break;
                case '}': 
                check = st.pop();
                if(check == '(' || check == '[')
                    return false;
                break;   
            }
        }

        return (st.isEmpty());
    }
}