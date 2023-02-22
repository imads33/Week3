
public class MergingArrays {
    public static void main(String[] args) {
        int arr[] = { 23, 90, 34, 11, 44, 55 };
        int Array1[] = new int[arr.length];
        int Array2[] = new int[(arr.length) + (Array1.length)];
        int i = -1;

        for (int j = 0; j < arr.length; j++) {
            Array2[++i] = arr[j];
        }
        for (int j = 0; i < Array1.length; i++) {
            Array2[++i] = Array1[j];
        }

        // System.out.println("Odd Array");
        // for (i = 0; i < k; i++) {
        // System.out.print(Array2[i] + ", ");
        // }
    }
}