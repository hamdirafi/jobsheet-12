import java.util.Scanner;

public class CinemaWithScanner01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter a name: ");
            name = scanner.nextLine();

            do {
                System.out.print("Enter row number (1-4): ");
                row = scanner.nextInt();
            } while (row < 1 || row > 4);

            do {
                System.out.print("Enter column number (1-2): ");
                column = scanner.nextInt();
            } while (column < 1 || column > 2);
            scanner.nextLine(); 

            audience[row - 1][column - 1] = name;

            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = scanner.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();

        System.out.println("\nAudience Seating Arrangement:");
        for (int i = 0; i < audience.length; i++) {
            for (int j = 0; j < audience[i].length; j++) {

                System.out.print((audience[i][j] != null ? audience[i][j] : "Empty") + "\t");
            }
            System.out.println(); 
        }
    }
}
