

import java.util.*;
import java.util.Stack; 

public class Lab3 {
    public static boolean checkBalance(String formula) {
        Stack <Character> balanced = new Stack<>();
        
        for (int i = 0; i < formula.length(); i++) {
            switch (formula.charAt(i)) {
                case '{': balanced.add('{');
                break;
                
                case '[': balanced.add('[');
                break;
                
                case '(': balanced.add('(');
                break;
                
                case '}':
                    if (balanced.pop() != '{') {
                        return false;
                    }
                break;
                
                case ']':
                    if (balanced.pop() != '[') {
                        return false;
                    }
                break;
                
                case ')':
                    if (balanced.pop() != '(') {
                        return false;
                    }
                break;
            }
        }
        
        if (balanced.isEmpty()) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public static String displayBalance(String formula) {
        String display;
        
        if (checkBalance(formula)) {
            display = String.format("%s This is balanced",formula);
        }else{
            display = String.format("%s This is not balanced",formula);
        }
        
        return display;
    }
    
    public static String postfix(String infix) {
        Stack <Character> operators = new Stack<>();
        String result = "";
        
        for (int i = 0; i < infix.length(); i++) {
            switch (infix.charAt(i)) {
                case '/': operators.add('/');
                break;
                
                case '*': operators.add('*');
                break;
                
                case '+': operators.add('+');
                break;
                
                case '-': operators.add('-');
                break;
                
                case '(': operators.add('(');
                break;
                
                case ')':
                    while (operators.peek() != '(') {
                        result += operators.pop();
                    }
                    
                    operators.pop();
                break;
                
                default: result += infix.charAt(i);
            }
        }
        
        return result;
    }
    
    public static int solve(String postfix) {
        Stack <Integer> result = new Stack<>();
        int temp;
        String tempStr;
        
        for (int i = 0; i < postfix.length(); i++) {
            switch (postfix.charAt(i)) {
                case '*': result.push(result.pop() * result.pop());
                break;
                
                case '+': result.push(result.pop() + result.pop());
                break;
                
                case '-':
                    temp = result.pop();
                    result.push(result.pop() - temp);
                break;
                
                case '/':
                    temp = result.pop();
                    result.push(result.pop() / temp);
                break;
                
                default:
                    tempStr = "";
                    tempStr += postfix.charAt(i);
                    
                    result.push(Integer.valueOf(tempStr));
            }
        }
        
        return result.peek();
    }
    
    public static boolean palindrome(String anagram) {
        Stack <Character> letters = new Stack<>();
        
        for (int i = 0; i < anagram.length(); i++) {
            letters.push(Character.toLowerCase(anagram.charAt(i)));
            letters.push(Character.toLowerCase(anagram.charAt(anagram.length()-i-1)));
            
            if (letters.pop() != letters.pop()) {
                return false;
            }
        }
        
        return true;
    }
    
    public static String printPalindrome(String anagram) {
        String output = anagram;
        
        if (palindrome(anagram)) {
            output += " is a palindrome";
        }
        
        else {
            output += " is not a palindrome";
        }
        
        return output;
    }
    
    public static void main(String[] args) {
        String formula1 = "[a{b/(c-d)+e/(f+g)}-h]";
        String formula2 = "{a[b+(c+2)/d]+e)+f}";
        String formula3 = "[a{b+[c(d+e)-f]+g}";
        
        System.out.println(displayBalance(formula1));
        System.out.println(displayBalance(formula2));
        System.out.println(displayBalance(formula3));
        
        String expression = "a/b*(c+(d-e))";
        String infix = "((a/b)*(c+(d-e)))";
        
        System.out.printf("\nThe postfix of %s:\n%s\n",expression,postfix(infix));
        
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
        
        String expression1 = String.format("%d%d+%d%d-/",a, e, b, d);
        
        String expression2 = String.format("%d%d%d*%d*-",a, b, c, d);
        
        String expression3 = String.format("%d%d%d-/%d*",a, b, c, d);
        
        System.out.printf("\n%s = %d",expression1,solve(expression1));
        System.out.printf("\n%s = %d",expression2,solve(expression2));
        System.out.printf("\n%s = %d\n\n",expression3,solve(expression3));
        
        System.out.println(printPalindrome("andrew"));
        System.out.println(printPalindrome("java"));
        System.out.println(printPalindrome("bob"));
    }
}
