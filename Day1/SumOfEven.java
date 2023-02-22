public class SumOfEven {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 55, 33 };
        int evenSum = 0;

        // sum of Odd elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            }
        }
        System.out.println("Sum of odd elemts is " + evenSum);
    }
}