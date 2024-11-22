public class Cinema01 {

    public static void main(String[] args) {
        String[][] audience = new String[5][2];
        audience[0][0] = "Aini";
        audience[0][1] = "Eka";
        audience[1][0] = "Deni";
        audience[1][1] = "Bela";
        audience[2][0] = "Cici";
        audience[2][1] = null; 
        audience[3][0] = "Fani";
        audience[3][1] = "Hani";
        audience[4][0] = "Gita";
        audience[4][1] = "Iman";

        System.out.println("Total length of the array (number of rows): " + audience.length);
        System.out.println("Length of the first row: " + audience[0].length);
        System.out.println("Length of the second row: " + audience[1].length);
        System.out.println("Length of the third row: " + audience[2].length);
        System.out.println("Length of the fourth row: " + audience[3].length);
        System.out.println("Length of the fifth row: " + audience[4].length);

        System.out.println("\nLength of each row using a for loop:");
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + " is: " + audience[i].length);
        }

        System.out.println("\nLength of each row using a foreach loop:");
        for (String[] rowAudience : audience) {
            System.out.println("Length of the row is: " + rowAudience.length);
        }

        System.out.print("\nAudience in the 3rd row using a for loop: ");
        for (int j = 0; j < audience[2].length; j++) {
            if (audience[2][j] != null) {
                System.out.print(audience[2][j] + " ");
            }
        }

        System.out.print("\nAudience in the 3rd row using a foreach loop: ");
        for (String name : audience[2]) {
            if (name != null) {
                System.out.print(name + " ");
            }
        }


        System.out.println("\n\nSearching for the name 'Cici' in the array:");
        String targetName = "Cici";
        boolean found = false;

        for (String[] row : audience) {
            for (String name : row) {
                if (targetName.equals(name)) {
                    System.out.println("Name found: " + name);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Name not found.");
        }

        String[] names = {"Aini", "Eka", "Deni"};
        String result = String.join(", ", names);
        System.out.println("\nUsing String.join(): " + result);
    }
}