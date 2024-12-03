public class Fibonacci {

    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int n) {
        // Edge case: If n <= 0, no Fibonacci numbers to print
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        long a = 0, b = 1, c;

        // Displaying first two numbers of Fibonacci series
        System.out.print("Fibonacci series up to " + n + " terms: ");

        // If the user wants to print at least 1 term
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // If the user wants to print at least 2 terms
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Generate Fibonacci numbers from the 3rd term
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
        System.out.println();  // Add a newline after printing the series
    }

    public static void main(String[] args) {
        // Hardcoded input: Number of terms in Fibonacci series
        int terms = 10;  // Change this value as needed

        // Generate Fibonacci series
        generateFibonacci(terms);
    }
}
