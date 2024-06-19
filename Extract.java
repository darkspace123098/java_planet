
import java.util.Scanner;

class Extract
{
    public static void main(String[] args) {
        int start,len,i;
        String str;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("Enter A string");
        str = sc.next();
        System.out.println("Enter the starting position :");
        start = sc.nextInt();
        System.out.println("Enter the number of character to be extracted :");
        len = sc.nextInt();
        for(i = (start); i< (start)+(len);i++)
        {
            sb.append(str.charAt(i));
        }
        System.out.println("Extracted String Is :"+sb);
    }
}