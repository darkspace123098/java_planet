import java.util.Scanner;

class Matrix
{
    public static void main(String[] args) {
        int sumrow;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row size:");
        int m = sc.nextInt();
        System.out.println("Enter the column Size :");
       int n = sc.nextInt();
        int a[][];
        a = new int[m][n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        m = a[0].length;
        n = a[0].length;

        for (int i = 0; i < m; i++) {
            sumrow = 0;
            for (int j = 0; j < n; j++) {
                sumrow = sumrow + a[i][j];
            }

            System.out.println("sum of"+(i+1)+"row is"+sumrow);
            
        }

    }
}