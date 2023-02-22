import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 23, 90, 34, 11, 44, 55 };
        int evenArray[] = new int[arr.length];
        int oddArray[] = new int[arr.length];
        int i=0,j=-1,k=-1;

        Scanner s = new Scanner(System.in);
        for (i = 0,j=0,k=0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[++j] = arr[i];
            }
            else{
                oddArray[++k] = arr[i];
            }
        }
        
        System.out.println("Even Array");
        for (i = 0; i < j; i++) {
            System.out.print(evenArray[i] + ", ");
        }
        
        System.out.println("Odd Array");
        for (i = 0; i < k; i++) {
            System.out.print(oddArray[i] + ", ");
        }
    }
}