import java.util.Scanner;

public class expo {

    public static int maxExponents(int a, int b) {
        int maxNumber = a;
        int maxExponent = 0;

        for (int i = a; i <= b; i++) {
            int exponent = 0;
            int num = i;

            // Calculate the exponent of 2 for the current number
            while (num % 2 == 0 && num > 0) {
                exponent++;
                num /= 2;
            }

            // Update maxNumber if the current number has a higher exponent of 2
            if (exponent > maxExponent) {
                maxExponent = exponent;
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the upper bound (b): ");
        int b = scanner.nextInt();
        
        int result = maxExponents(a, b);
        System.out.println("Number with maximum exponent of 2 between " + a + " and " + b + " is: " + result);
        
        scanner.close();
    } 
}