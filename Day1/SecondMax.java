public class SecondMax {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 55, 33 };
        int secondMax = 0, max = arr[0];

        // MAX value of given array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second max value is " + secondMax);
    }
}