
public class MultOfMatrix{
    public static void main(String[] args){
        int arr[][]={{4,6,2},
                     {7,9,4},
                     {6,9,3}};
        
        int arr2[][]={{1,0,0},
                      {0,1,0},
                      {0,0,1}};
        
        int result[][]=new int[3][3];

        int i,j,k,sum=0,mul=1;

        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                for(k=0;k<result.length;k++){
                    mul=arr[i][k]*arr2[k][j];
                    sum=mul+sum;
                    result[i][j]=sum;
                }
            }
        }
        
        System.out.println("Resultant matrix is");
        for(i=0;i<result.length;i++){
            for(j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}