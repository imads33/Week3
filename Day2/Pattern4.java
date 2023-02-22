public class Pattern4 {
    public static void main(String args[]) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (col % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}