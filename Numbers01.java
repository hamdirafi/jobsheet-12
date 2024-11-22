import java.util.Scanner;

public class Numbers01 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];  
        myNumbers[1] = new int[3];  
        myNumbers[2] = new int[1];  

        System.out.println("Input values for the 2D array:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print("Enter value for myNumbers[" + i + "][" + j + "]: ");
                myNumbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValues in the 2D array:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
