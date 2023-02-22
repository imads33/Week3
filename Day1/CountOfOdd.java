public class CountOfOdd {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 55, 33 };
        int oddCount = 0;

        // count of even elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Even count is " + oddCountnt);
    }
}