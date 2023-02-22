public class MinimumElement {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 55, 33 };
        int minimum = arr[0];

        // MAX value of given array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Minimum value is " + minimum);
    }
}