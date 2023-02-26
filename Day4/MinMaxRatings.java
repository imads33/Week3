
public class MinMaxRatings{
    public static void main(String[] args){
        int arr[][]={{4,6,2,5},
                     {7,9,4,8},
                     {6,9,3,7}};
        int min=arr[0][0],max=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==min){
                    System.out.println("Minimum rating is "+min+" with the index value                              ["+i+"]["+j+"]");
                }
                if(arr[i][j]==max){
                    System.out.println("Maximum rating is "+max+" with the index value                              ["+i+"]["+j+"]");
                }
            }
        }
    }
}