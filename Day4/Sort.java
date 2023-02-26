public class Sort{
    public static void main(String[] args){
        int temp=0;
        int array[]={-5,-6,-8,0,3,8,-2,6,4,-1,5,7};

         System.out.println("Array elements are");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                if(array[j]>array[i]){
                    if(array[j]<0){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }
        System.out.println(" ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}