import java.util.Scanner;

class MenuProgram {
    Scanner s = new Scanner(System.in);

    int arr[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 }, { 2, 5, 7, 9 } };

    public void Display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void isSum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of the elements in array is " + sum);
    }

    public void isSquare() {
        if (arr.length == arr[0].length) {
            System.out.println("Yes it is Square matrix");
        } else {
            System.out.println("No it is not Square matrix");
        }
    }

    public void isDiagonal() {
        int sum = 0;
        System.out.println("The Diagonal Elements in the array are");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("The sum of the Diagonal Elements is " + sum);
    }

    public void viewOptions() {
        do {
            System.out.println("Enter your option");
            System.out.println("1. To Display all the elements in the 2D array");
            System.out.println("2. To get sum of all the elements in the 2D array");
            System.out.println("3. To check whether it is square matrix or not");
            System.out.println("4. To know Diagonal elements");
            System.out.println("5. To Exit");
            int option = s.nextInt();
            if (option == 5) {
                break;
            }
            switch (option) {
                case 1:
                    Display();
                    break;
                case 2:
                    isSum();
                    break;
                case 3:
                    isSquare();
                    break;
                case 4:
                    isDiagonal();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (true);
    }

    public static void main(String args[]) {
        MenuProgram obj = new MenuProgram();
        obj.Display();
        obj.viewOptions();
    }
}