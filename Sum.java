
import java.util.Scanner;

class Sum
{
    public static void main(String args[])
    {
        int n1,n2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number :");
        n1 = sc.nextInt();
        System.out.println("Enter the 2 number :");
        n2 = sc.nextInt();
        while((n1>0)&&(n2>0))
        {
            sum = sum+((n1%10)*(n2%10));
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println("sum :"+sum);
    }
}