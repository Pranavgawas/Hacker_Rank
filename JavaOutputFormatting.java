import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            System.out.printf("%-15s%03d", s1, x);
            System.out.println();
        }
        sc.close();
        System.out.println("================================");

        
        // This code uses the following format specifiers in the printf() call:

        // %-20s: This specifier formats the string argument as a left-justified string
        // with a maximum width of 20 characters.
        // %03d: This specifier formats the integer argument as a zero-padded decimal
        // number with a minimum width of 3 digits.
        // The \n character at the end of the printf() call tells Java to print a
        // newline character after the formatted output.
    }
}
