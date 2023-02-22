public class Pattern2 {
    public static void main(String args[]) {
        int number = 10, number2 = 99;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row % 2 == 0) {
                    System.out.print(number + " ");
                    number++;
                } else {
                    System.out.print(number2 + " ");
                    number2--;
                }
            }
            System.out.println();
        }
    }
}