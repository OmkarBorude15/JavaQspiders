import java.util.Scanner;
class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 123;
        int dup  =num;
        int rev =  0;

        int rem = num%10;
        rev= rev*10 + rem;

        num = num/10;
        rem = num%10;
        rev = rev *10 +rem;

        num = num/10;
        rem = num%10;
        rev = rev*10+rem;
        System.out.println(dup +": "+ rev );



    }
    
}
