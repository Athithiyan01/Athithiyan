public class sixpg {
    public static void main(String[] args) {
        int k = 5; // Maximum number

        for (int i = 1; i <= k; i++) { // Loop for each row
            for (int j = 1; j <= k; j++) { // Loop for each column
                if (j <= i) {
                    System.out.print((k - j + 1) + " ");
                } else {
                    System.out.print((k - i + 1) + " ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}

