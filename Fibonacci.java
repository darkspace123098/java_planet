
import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the minimum :");
        m = sc.nextInt();
        System.out.println("Enter the maximum :");
        n = sc.nextInt();

        int a = 0, b=1;
        System.out.println("Fibonacci Numbers Are :");
        for ( a = 0; a <=n;a++) {
            if(a>m)
            {
                System.out.println(a);
                int c = a+b;
                a = b;
                b = c;
            }
        }
    }
}