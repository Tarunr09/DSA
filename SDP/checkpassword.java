import java.util.Scanner;

public class checkpassword {
    public static int check(String s){
        if(s.length() <= 4) return 0;
        else if(Character.isDigit(s.charAt(0))) return 0;
        else if(s.contains(" ") || s.contains("/")) return 0;
        else if(!s.matches(".*[A-Z].*")) return 0;
        else if(!s.matches(".*[0-9].*")) return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String s = sc.nextLine();
        int result = check(s);
        if (result == 1)
            System.out.println("The password is valid");
        else
            System.out.println("The password is invalid");
    }
}