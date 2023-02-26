import java.util.Scanner;
public class Ratings{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int arr[][]={{4,6,2,5},
                     {7,9,4,8},
                     {6,9,3,7}};
        int num=0,count=0;
        System.out.println("Enter parameter");
        num=s.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=3;j<arr[i].length;j++){
                if(arr[i][j]>num){
                    count++;
                    System.out.println(arr[i][j]+" with the index value ["+i+"]["+j+"]"); 
                }
            }
        }
        System.out.println("Ratings are : "+count);
    }
}