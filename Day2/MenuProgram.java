import java.util.Scanner;

public class MenuProgram {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 24, 56, 85, 1, 25, 36, 25, 24 };
    int number, index, temp, deleted, noOfElements = arr.length;
    int array[] = new int[100];

    public void insertElement() {
        int choice;
        System.out.println("1. Insertion at First");
        System.out.println("2. Insertion at Last");
        System.out.println("3. Insertion at Specific Location");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();
        System.out.println("Enter Number To Insert :");
        number = sc.nextInt();

        switch (choice) {
            case 1:
                insertFirst(number);
                break;
            case 2:
                insertLast(number);
                break;
            case 3:
                System.out.println("Enter Index Position ");
                index = sc.nextInt();
                insertSpecific(number, index);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void deleteElement() {
        int choice;
        System.out.println("1. Delete at First");
        System.out.println("2. Delete at Last");
        System.out.println("3. Delete at Specific Location");
        System.out.println("4. Delete Specific Element");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                deleteFirst();
                break;
            case 2:
                deleteLast();
                break;
            case 3:
                System.out.println("Enter Index Position");
                index = sc.nextInt();
                deleteSpecificIndex(index);
                break;
            case 4:
                System.out.println("Enter Number to Delete :");
                number = sc.nextInt();
                deleteSpecificNumber(number);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void searchElement() {
        int choice;
        System.out.println("1. Search Element in Aray");
        System.out.println("2. Frequency of Element in Array");
        System.out.println("3. Duplicate Elements in Array");
        System.out.println("4. Unique Elements in Array");
        System.out.println("5. Frequency of each Element in Array");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Numbere to be Searched :");
                number = sc.nextInt();
                search(number, 's', 0);
                break;
            case 2:
                System.out.println("Enter Numbere to find frequency :");
                number = sc.nextInt();
                search(number, 'f', 0);
                break;
            case 3:
                duplicateElement();
                break;
            case 4:
                uniqueElement();
                break;
            case 5:
                eachElementFrequency();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void addElements() {
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }

    /* ---------------- Insertion Operation Methods ------------ */
    public void insertFirst(int number) {
        if (noOfElements == 0) {
            array[0] = number;
            noOfElements++;
        } else {
            for (int i = noOfElements; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = number;
            noOfElements++;
        }
        displayArray('a');
    }

    public void insertLast(int number) {
        for (int i = noOfElements; i > noOfElements - 1; i--) {
            array[i] = number;
            noOfElements++;
        }
        displayArray('a');
    }

    public void insertSpecific(int number, int index) {
        for (int i = noOfElements; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        noOfElements++;
        displayArray('a');
    }
    /* ----------------------- END ---------------------- */

    /* ---------------- Deletion Operation Methods ------------ */
    public void deleteFirst() {
        for (int i = 0; i <= noOfElements; i++) {
            if (i == 0) {
                deleted = array[i];
                array[i] = array[i + 1];
            }
            array[i] = array[i + 1];
        }
        noOfElements--;
        System.out.println(deleted + " is deleted");
        displayArray('b');
    }

    public void deleteLast() {
        for (int i = noOfElements - 1; i > noOfElements - 2; i--) {
            deleted = array[i];
        }
        noOfElements--;
        System.out.println(deleted + " is deleted");
        displayArray('b');
    }

    public void deleteSpecificIndex(int index) {
        for (int i = index; i < noOfElements; i++) {
            if (i == index) {
                deleted = array[i];
                array[i] = array[i + 1];
            }
            array[i] = array[i + 1];
        }
        noOfElements--;
        displayArray('b');
    }

    public void deleteSpecificNumber(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                deleteSpecificIndex(i);
                break;
            }
        }
    }
    /* ----------------------- END ---------------------- */

    /* ---------------- Search Operation Methods ------------ */
    public void search(int number, char d, int index) {
        int count = 0, numberIndex = -1;
        for (int i = index; i < noOfElements; i++) {
            if (d == 's') {
                if (array[i] == number) {
                    numberIndex = i;
                    break;
                }
            } else {
                if (array[i] == number) {
                    count++;
                }
            }
        }

        if (d == 'e') {
            System.out.println("The '" + number + "' repeated '" + count + "' times in array");
        } else {
            if (numberIndex > -1) {
                System.out.println("Element found at " + numberIndex + " position");
            } else if (count > 0) {
                System.out.println("The given number repeated " + count + " times in array");
            } else {
                System.out.println("given number is not prsent in Array");
            }
        }
    }

    public void duplicateElement() {
        System.out.println("Duplicate Numbers");
        int duplicate = 0;
        for (int i = 0; i < noOfElements; i++) {
            for (int j = i; j < noOfElements; j++) {
                if (array[i] == array[j + 1]) {
                    System.out.print(array[i] + " ");
                    duplicate++;
                    continue;
                }
            }
        }
        if (duplicate == 0) {
            System.out.println("There are no duplicate elements");
        }
    }

    public void uniqueElement() {
        int count = 0;
        System.out.println("Unique Numbers");
        for (int i = 0; i < noOfElements; i++) {
            for (int j = 0; j < noOfElements; j++) {
                if (array[i] == array[j]) {
                    if(i==j){
                        continue;
                    }else{
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.print(array[i] + ", ");
            }
            count=0;
        }
        if (count > 0) {
            System.out.println("There are no unique elements");
        }
    }

    public void eachElementFrequency() {
        System.out.println("Repeated Numbers are");
        for (int i = 0; i < noOfElements; i++) {
            search(array[i], 'e', 0);
        }
    }
    /* ----------------------- END ---------------------- */

    public void displayArray(char c) {
        if (c == 'a') {
            System.out.println("Array After Insertion Operation");
        } else if (c == 'b') {
            System.out.println("Array After Deletion Operation");
        } else {
            System.out.println("Array elements are");
        }
        for (int i = 0; i < noOfElements; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MenuProgram mp = new MenuProgram();
        int choice;
        mp.addElements();
        mp.displayArray('c');
        do {
            System.out.println("\n1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.println("Please Choose your option :");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    mp.insertElement();
                    break;
                case 2:
                    mp.deleteElement();
                    break;
                case 3:
                    mp.searchElement();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if (choice == 4) {
                break;
            }
        } while (true);
    }
}