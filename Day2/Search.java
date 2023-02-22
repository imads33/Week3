import java.util.Scanner;
public class Search{
     public static void main(String[] args) {
        int arr[]={23,90,34,11,44,55};

         int index=-1;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter value to be searched");
         int number=s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index=i;
                break;
            }
        }
         if(index > -1){
             System.out.print("index position of given number is "+index);
         }else{
             System.out.print("given number is not prsent in Array");
         }
     }
}