import java.util.*;

public class Test {
    public static void main(String[] args) {

        String[] a1 = {"a", "b"};
        System.out.println("a1: " + Arrays.toString(a1));
        String[] a2 = a1; // copy location
        System.out.println("a2:" + Arrays.toString(a2));
        a2[0] = "c";
        System.out.println("new a1:" + Arrays.toString(a1));
        System.out.println("new a2:" + Arrays.toString(a2));

    }
}
