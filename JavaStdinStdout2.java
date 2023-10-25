import java.util.Scanner;
public class JavaStdinStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        // Note: If you use the nextLine() method immediately following the nextInt()
        // method, recall that nextInt() reads integer tokens; because of this, the last
        // newline character for that line of integer input is still queued in the input
        // buffer and the next nextLine() will be reading the remainder of the integer
        // line (which is empty).
        
// Yes, I am aware of this issue. It is caused by the fact that nextInt() reads
// integer tokens, but leaves the newline character at the end of the line in
// the input buffer. This means that when you call nextLine() immediately after
// nextInt(), nextLine() will return an empty string, because it will only read
// the newline character that is already in the input buffer.

// There are two ways to solve this problem:

// Consume the newline character after the nextInt() call. You can do this by
// calling nextLine() immediately after nextInt(), even if you don't need the
// value that nextLine() returns.
// Read all of the input as strings and parse them to the correct data type
// later. This is the more general approach, and it is also more robust, because
// it can handle any type of input, not just integers.

        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
