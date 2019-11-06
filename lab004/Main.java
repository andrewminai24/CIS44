import java.util.Scanner;

public class Main {
    public static int getInput() {
        Scanner scan = new Scanner(System.in);
        int input;
        
        try {
            System.out.print("Insert some positive integer: ");
            input = scan.nextInt();
            
            if(input < 0) {
                throw new Exception();
            }
            
            else {
                return input;
            }
        }
        
        catch (Exception error) {
            System.out.println("Wrong input\n");
            return getInput();
        }
    }
    
   public static int total(int n){
        if(n <= 1 )
            return 1;
        else 
            return n + total(n-1);
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
    
    public static void bigO1(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("\nO(n) to display all integers in an array of integers\n");
    }
    
    public static void bigO2(int[] nums) {
        BagInterface linkedNums = new LinkedBag();
        
        for(int i = 0; i < nums.length; i++) {
            linkedNums.add(nums[i]);
        }
        
        linkedNums.display();
        
        System.out.println("\nO(n) to display all integers in a chain of linked nodes\n");
    }
    
    public static void bigO3(int[] nums, int n) {
        System.out.printf(
                "Index[%d] = %d\n"
                        + "O(1) to display the nth integer in an array of integers\n",
                n,
                nums[n]
        );
    }
    
    public static void bigO4(int[] nums, int n) {
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
        BagInterface<String> bag = new LinkedBag<String>();
        
        bag.add("a");
        bag.add("ba");
        bag.add("aa");
        bag.add("ba");
        bag.add("cn");
        bag.add("andrew");
    
        System.out.printf("Original List:\n%s\n\n",bag);
        
        System.out.print("Reverse Order:\n");
        bag.reverse();
        
        System.out.println("\n");
        int userInput = getInput();
        
        System.out.printf(
                "\nSum of all numbers from 1-%d: %d\n\n",
                userInput,
                total(userInput)
        );
        
        userInput = getInput();
        
        System.out.printf(
                "\nSum of all even numbers from 0-%d: %d\n\n",
                userInput,
                evenSum(userInput)
        );
        
        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        
        bigO1(nums);
        bigO2(nums);
        bigO3(nums, 3);
        bigO4(nums, 6);
        
        System.out.println("\n6n2 + 3 is O(n2) because 6n^2 +3 is O(n²), since 6n^2 + 3 < 2n² for all n > 10");
        System.out.println("n2 + 17n + 1 is O(n2) because n2 n^2  17n + 1 < 2n² for all n > 10");
    }
}
