// Duplicate replace it with $

// import java.util.Scanner;

// public class prob1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String s = sc.nextLine();
//         char myChar = sc.next().charAt(0);

//         char[] ch = s.toCharArray();

//         for(int i=0; i<ch.length; i++){
//             for(int j=0; j<ch.length; j++){
//                 if(i!=j && ch[i] == ch[j]){
//                     ch[i] = myChar;
//                     ch[j] = myChar;
//                 }
//             }           
//         }
//         System.out.println(ch);
//     }
// }

import java.util.Scanner;

public class prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter char:");
        char myChar = sc.next().charAt(0);

        char[] ch = s.toCharArray();
        boolean[] temp = new boolean[ch.length];

        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length; j++){
                if(i!=j && ch[i] == ch[j]){
                    temp[i] = true;
                }
            }           
        }
        for(int i=0; i<ch.length; i++){
            if(temp[i]){
                ch[i] = myChar;
            }
        }
        System.out.println(ch);
    }
}