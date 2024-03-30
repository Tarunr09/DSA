import java.util.Scanner;

public class mpcs{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] oxygenLevels = new int[3][3];

        // Taking input 
        for (int i = 0; i < 3; i++) {
            System.out.println("Round " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Oxygen value of trainee " + (j + 1) + ": ");
                int oxygen = scanner.nextInt();
                if (oxygen < 1 || oxygen > 100) {
                    System.out.println("INVALID INPUT");
                    return;
                }
                oxygenLevels[j][i] = oxygen;
            }
        }

        int[] averages = new int[3];
        int maxAverage = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += oxygenLevels[i][j];
            }
            averages[i] = Math.round((float) sum / 3);
            maxAverage = Math.max(maxAverage, averages[i]);
            
            System.out.println("Average oxygen level for Trainee " + (i + 1) + ": " + averages[i]);
        }

        if (maxAverage < 70) {
            System.out.println("All trainees are unfit.");
            return;
        }

        System.out.println("Most fit trainee(s):");
        for (int i = 0; i < 3; i++) {
            if (averages[i] == maxAverage) {
                System.out.println("Trainee Number: " + (i + 1)+ " has the highest oxygen level");
            }
        }
    }
}