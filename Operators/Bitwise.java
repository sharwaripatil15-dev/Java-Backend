package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int number = 23; // Example number
        int n = 3; // Bit position to clear (0-indexed)

        System.out.println("Original number: " + number);
        System.out.println("Binary representation: " + Integer.toBinaryString(number));

        // Clear the nth bit
        int clearedNumber = clearBit(number, n);

        System.out.println("Number after clearing the " + n + "th bit: " + clearedNumber);
        System.out.println("Binary representation: " + Integer.toBinaryString(clearedNumber));
    }

    // Function to clear the nth bit of a number
    public static int clearBit(int number, int n) {
        // Create a mask with the nth bit set to 0 and all other bits set to 1
        int mask = ~(1 << n);

        // Apply the mask to clear the nth bit
        int result = number & mask;
        return result;
    }
}

