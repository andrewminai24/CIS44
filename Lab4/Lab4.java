/*
    Write a recursive method to display a linked list in reverse order.
	•	Write a recursive method that accepts a number and finds the sum of all numbers from 1 to that number recursively. In other words, if the input to the function is 5, the output must be 5 + 4 + 3 + 2 + 1 + 0. Main must print the sum.
	•	Write a recursive method that accepts a number and finds the sum of all the numbers smaller than that number and are even. Main must print the sum.
	•	Answer the following question:


	•	Answer the following question:

*/
public class Lab4{

    public static void main(String[] args){
        System.out.println(fact(2));

    }

    public static long recursiveSum(long n){
        if(n <= 1 )
            return 1;
        else 
            return n + fact(n-1);
    }
}

    
    //1.
    public static int getInput() {
        Scanner scan = new Scanner(System.in);
        int input;
        
        try {
            System.out.print("Enter a Positive Integer: ");
            input = scan.nextInt();
            
            if(input < 0) {
                throw new Exception();
            }
            
            else {
                return input;
            }
        }
        
        catch (Exception error) {
            System.out.println("Error: Invalid Input\n");
            return getInput();
        }
    }

    public static int evenSum(int sum) {
        if(sum > 0 && sum % 2 == 0) {
            return sum + evenSum(sum - 1);
        }
        
        else if(sum > 0) {
            return evenSum(sum - 1);
        }
        
        else {
            return sum;
        }
    }
    
    public static void bigOhA(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("\nO(n) to display all integers in an array of integers\n");
    }
    
    public static void bigOhB(int[] nums) {
        BagInterface linkedNums = new LinkedBag();
        
        for(int i = 0; i < nums.length; i++) {
            linkedNums.add(nums[i]);
        }
        
        linkedNums.display();
        
        System.out.println("\nO(n) to display all integers in a chain of linked nodes\n");
    }
    
    public static void bigOhC(int[] nums, int n) {
        System.out.printf(
                "Index[%d] = %d\n"
                        + "O(1) to display the nth integer in an array of integers\n",
                n,
                nums[n]
        );
    }
    
    public static void bigOhD(int[] nums, int n) {
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            if(nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        
        System.out.printf(
                "\nSum of first %d even integers: %d\n"
                        + "O(n) to compute the sum of the first n even integers in an array of integers\n",
                n,
                sum
        );
    }
    
    public static void main(String[] args) {
        BagInterface newBag = new LinkedBag();
        
        newBag.add(1);
        newBag.add('a');
        newBag.add(-2);
        newBag.add('b');
        newBag.add(3.45);
        newBag.add("L33t");
        
        System.out.printf(
                "Original List:\n%s\n\n",
                newBag
        );
        
        System.out.print("Reverse Order:\n");
        newBag.reverse();
        
        System.out.println("\n");
        int userInput = getInput();
        
        System.out.printf(
                "\nSum of all numbers from 1-%d: %d\n\n",
                userInput,
                sumTotal(userInput)
        );
        
        userInput = getInput();
        
        System.out.printf(
                "\nSum of all even numbers from 0-%d: %d\n\n",
                userInput,
                evenSum(userInput)
        );
        
        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        
        bigOhA(nums);
        bigOhB(nums);
        bigOhC(nums, 3);
        bigOhD(nums, 6);
        
        System.out.println("\n6n2 + 3 is O(n2) because n2 is the highest exponent");
        System.out.println("n2 + 17n + 1 is O(n2) because n2 is the highest exponent");
        }
    }
}