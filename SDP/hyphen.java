import java.util.Scanner;
public class hyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        hyphen h = new hyphen();
        String result = h.moveHyphen(str);
        System.out.println(result);
    }

    public String moveHyphen(String str) {
        if(str == null){
            return null;
        }
        StringBuffer result = new StringBuffer();
        StringBuffer hyphen = new StringBuffer();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '-'){
                hyphen.append(ch);
            } else {
                result.append(ch);
            }
        }
        result.insert(0, hyphen.toString());
    
        return result.toString();
    }
}
