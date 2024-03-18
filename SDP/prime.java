import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }
}
 