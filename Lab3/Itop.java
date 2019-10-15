import java.util.*;
import java.lang.*;
import java.io.*;

class Itop {
    //method isp return in stack operator precedence
    static int isp(char ch) {
        switch (ch) {
            case '+':
                return 1;

            case '-':
                return 1;

            case '*':
                return 2;

            case '/':
                return 2;

            case '^':
                return 3;

            case '(':
                return 0;


        }
        return 0;
    }
    //method icp return in coming operator precedence
    static int icp(char ch) {
        switch (ch) {
            case '+':
                return 1; //when incoming and in stack are same then pop because it follow left associatvity

            case '-':
                return 1;

            case '*':
                return 2;

            case '/':
                return 2;

            case '^':
                return 4; //.because ^ follow right associativity

            case '(':
                return 10;


        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        Stack < Character > st = new Stack < Character > ();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.replaceAll("\\s+", ""); //for remove white space from string
        char ar[];
        ar = str.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if ((ar[i] >= 'a' && ar[i] <= 'z') || (ar[i] >= 'A' && ar[i] <= 'Z'))
                System.out.print(ar[i]); //if character then print it
            else {
                if (st.isEmpty())
                    st.push(ar[i]); //if stack empty then push
                else if (ar[i] == ')') //if incoming operator is ')' pop until not get '(' at top of stack and print
                {
                    while (st.peek() != '(')
                        System.out.print(st.pop());
                    st.pop();
                } else if (isp(st.peek()) >= icp(ar[i])) {
                    while (!st.isEmpty() && isp(st.peek()) >= icp(ar[i])) //pop while icp less then isp and print
                        System.out.print(st.pop());
                    st.push(ar[i]);
                } else st.push(ar[i]);
            }
        }
        while (!st.isEmpty())
            System.out.print(st.pop());
        System.out.println();


    }
}