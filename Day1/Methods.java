public class Methods{
    
    int arr[]={23,90,34,11,44,55};
    
    public void Palindrome() {
        int rem, rev = 0;

        for(int i=0;i<arr.length;i++){
            int temp2=arr[i];

            while (temp2 != 0) {
                rem = temp2 % 10;
                rev = rev * 10 + rem;
                temp2 = temp2 / 10;
            }

            if(arr[i]==rev){
                System.out.println("Palindrome "+arr[i]);
            }
        }
    }

    public void PrimeNumber() {
       for(int i=0;i<arr.length;i++) {
            int factor = 1, count = 0,number=arr[i];
            while (factor <= number / 2) {

                if (number % factor == 0) {
                    count = count + 1;
                }
                factor = factor + 1;
            }
            if (count == 1) {
                System.out.println(number);
            }
        }
    }
    
    public static void main(String[] args) {
        Methods method=new Methods();
        method.Palindrome();
        method.PrimeNumber();
    }
}
