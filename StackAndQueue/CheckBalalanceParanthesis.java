import java.util.Stack;

class CheckBalalanceParanthesis{
    public static void main(String[] args){
        String str = "()(())";
        if(isBalanced(str)){
            System.out.println("String is balanced");
        }else{
            System.out.println("String is not balanced");
        }
    }

    static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char x  = str.charAt(i);
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char check;
            switch(x){
                case ')' :
                check = stack.pop();
                if(x == '{' || x == '[')
                    return false;
                break;

                case '}' :
                check = stack.pop();
                if(x == '(' || x == '[')
                    return false;
                break;

                case ']' :
                check = stack.pop();
                if(x == '(' || x == '{')
                    return false;
                break;
            }
        }

        return stack.isEmpty();

    }
}