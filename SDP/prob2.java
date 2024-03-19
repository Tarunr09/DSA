//each word ka 1st and last letter should be swapped
//so for the 1st char of the word, the prev char should be space and the nxt char should be a letter (for the 1st char of the 1st word, idx=0)
// for the last char of the word, the nxt char should be space and the prev char should be a letter (for the last char of the last word, idx=last)

import java.util.Scanner;

public class prob2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Check if current character is the first character of a word
            if ((i == 0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i - 1] == ' ')) {
                int start = i; // Starting index of the word
                // Find the end index of the word
                while (i < ch.length && ch[i] != ' ') {
                    i++;
                }
                int end = i - 1; // Ending index of the word
                
                // Swap first and last letters of the word
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
            }
        }

        // Print the modified string
        System.out.println("Modified string:");
        System.out.println(ch);
    }
}

