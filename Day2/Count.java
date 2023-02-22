import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = { 23, 90, 34, 11, 44, 55 };
        int count = 0;

        System.out.println("Enter value to be counted");
        int number = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        if (count>0) {
            System.out.print("The given number repeated " + count + " times in array");
        } else {
            System.out.print("The given number is not present in array");

        }
    }
}