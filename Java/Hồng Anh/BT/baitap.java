import java.util.Arrays;
import java.util.Scanner;
public class baitap{
    // public static boolean checkPrefect(int n)
    // {
    //     int s = 0;
    //     for(int i = 1; i < n; i++)
    //         s += i;
    //     if(s == n)
    //         return true;
    //     return  false;
    // }

    // public static long f(int n)
    // {
    //     if(n == 1 || n == 2)
    //         return 1; 
    //     else
    //         return f(n-1) + f(n-2);
    // }

    public static void input(int a[], int n)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        scanner.close();
    }

    public static void output(int a[])
    {
        for(var i : a)
            System.out.print(i + " ");
        System.err.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        input(a, n);
        output(a);
        int a1[] = Arrays.copyOf(a, a.length + 1);
        a1[a1.length - 1] = 10;
        output(a1);
        scanner.close();

        // for(int i = 1; i <= 200; i++)
        //     System.out.println(f(i));

        // int n;
        // System.out.println("Nhap n: ");
        // n = scanner.nextInt();
        // for(int i = 1; i < n; i++)
        //     if(checkPrefect(n))
        //         System.out.println(n);

        // if(checkPrefect(6))
        //     System.err.println("Yes");
    }

}