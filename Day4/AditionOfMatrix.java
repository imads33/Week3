
public class AditionOfMatrix{
    public static void main(String[] args){
        int arr[][]={{4,6,2,5},
                     {7,9,4,8},
                     {6,9,3,7}};
        
        int arr2[][]={{1,0,3,7},
                      {0,1,0,8},
                      {2,8,3,4}};
        
        int result[][]=new int[3][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        
        System.out.println("Resultant matrix is");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}