public class OddEvenIndex {
    public static void main(String[] args) {
        int arr[] = { 23, 78, 90, 567, 98, 20 };

        System.out.println("Array Before updating the values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 5;
            } else {
                arr[i] = arr[i] - 5;
            }
        }

        System.out.println("Array after updating the values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}