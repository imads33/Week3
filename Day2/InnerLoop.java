public class InnerLoop{
    public static void main(String args[]) {
        int number=10;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5;col++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}