import java.util.Scanner;

public class mirror {

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the reverseString function to get the mirror image
        String mirrorImage = reverseString(input);

        // Print the mirror image
        System.out.println("Mirror Image: " + mirrorImage);

        scanner.close();
    }
}

