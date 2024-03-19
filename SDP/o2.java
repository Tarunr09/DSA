import java.util.*;
// import java.util.Scanner;

// public class o2 {
//     public static void main(String[] args) {
//         int rounds = 3;
//         Scanner sc = new Scanner(System.in);
//         int a1 = 95;
//         int a2 = 92;
//         int a3 = 95;
//         int a4 = 92;
//         int a5 = 90;
//         int a6 = 92;
//         int a7 = 90;
//         int a8 = 92;
//         int a9 = 90;

//         int num1 = t1(a1, a2, a3);
//         int num2 = t2(a4, a5, a6);
//         int num3 = t3(a7, a8, a9);

//         int max = Math.max(Math.max(num1, num2), num3);

//         System.out.println("Maximum number: " + max);  
//         System.out.println("Average of 1st trainee: " + num1);
//         System.out.println("Average of 2nd trainee: " + num2);
//         System.out.println("Average of 3rd trainee: " + num3);
//     }

//     static int t1(int a1, int a2, int a3) {
//         int avg = (a1 + a2 + a3) / 3;
//         return avg;
//     }

//     static int t2(int b1, int b2, int b3) {
//         int avg = (b1 + b2 + b3) / 3;
//         return avg;
//     }

//     static int t3(int c1, int c2, int c3) {
//         int avg = (c1 + c2 + c3) / 3;
//         return avg;
//     }
// }


// public class o2 {

//     public static void main(String[] args) {
//         int n = 3; //rows
//         int m = 3; //cols
//         int marks[][] = new int [n][m];

//         Scanner sc = new Scanner(System.in);
        
//         for(int i=0; i<n; i++) {
//             System.out.println("Enter o2 lv of round:" + i);
//             for(int j=0; j<m; j++) {
//                 marks[i][j] = sc.nextInt(); // marks of ith student
//             }
//         }
        
//         int a = marks[0][0] + marks[1][0] + marks[2][0] / 3;
//         int b = marks[0][1] + marks[1][1] + marks[2][1] / 3;
//         int c = marks[0][2] + marks[1][2] + marks[2][2] / 3;

//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(marks[i][j] +" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

import java.util.Scanner;

public class o2 {

    public static void main(String[] args) {
        int n = 3; 
        int m = 3; 
        int marks[][] = new int [n][m];

        Scanner sc = new Scanner(System.in);

        // Taking input for each trainee's oxygen levels
        for(int i = 0; i < n; i++) {
            System.out.println("Enter o2 lvl of round " + (i + 1) );
            for(int j = 0; j < m; j++) {
                int oxygenLevel;
                do {
                    System.out.print("Enter oxygen level for trainee " + (j + 1) + ": ");
                    oxygenLevel = sc.nextInt();
                } while (oxygenLevel < 1 || oxygenLevel > 100); 
                marks[i][j] = oxygenLevel; 
            }
        }

        int a = (marks[0][0] + marks[1][0] + marks[2][0]) / 3;
        int b = (marks[0][1] + marks[1][1] + marks[2][1]) / 3;
        int c = (marks[0][2] + marks[1][2] + marks[2][2]) / 3;

        int max = Math.max(Math.max(a, b), c);
        
        System.out.println("Trainee A average oxygen level: " + a);
        System.out.println("Trainee B average oxygen level: " + b);
        System.out.println("Trainee C average oxygen level: " + c);

        if (max < 70) {
            System.out.println("All trainees are unfit.");
        } else {
            if (max == a) {
                System.out.println("Trainee A has the highest oxygen level with an average of " + a);
            }
            if (max == b) {
                System.out.println("Trainee B has the highest oxygen level with an average of " + b);
            }
            if (max == c) {
                System.out.println("Trainee C has the highest oxygen level with an average of " + c);
            }
        }
    }
}
