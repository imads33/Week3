import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        int arr[] = { 23, 90, 34, 11, 44, 55 };
        int posArray[] = new int[arr.length];
        int negArray[] = new int[arr.length];
        int i = 0, j = -1, k = -1;

        Scanner s = new Scanner(System.in);
        for (i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                posArray[++j] = arr[i];
            } else {
                negArray[++k] = arr[i];
            }
        }

        System.out.println("Even Array");
        for (i = 0; i < j; i++) {
            System.out.print(posArray[i] + ", ");
        }

        System.out.println("Odd Array");
        for (i = 0; i < k; i++) {
            System.out.print(negArray[i] + ", ");
        }
    }
}