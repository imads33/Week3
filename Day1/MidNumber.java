public class MidNumber{
    public static void main(String[] args){
        int arr[]={23,90,34,11,44,55,112};
        int size=arr.length;
        if(size%2==0){
            size=size/2;
            System.out.println("Middle numbers are "+arr[size-1]+", "+arr[size]);
        }else{
            size=size/2;
            System.out.println("Middle numbers are "+arr[size]);
        }
    }
}