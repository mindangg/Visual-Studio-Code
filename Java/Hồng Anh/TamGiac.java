import java.util.Scanner;
public static class TamGiac
{
    int a;
    int b;
    int c;
    Scanner sc = new Scanner(System.in);

    public TamGiac()
    {

    }

    public TamGiac(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void SetCanhA(int a)
    {
        while(a <= 0)
        {
            System.out.println("Nhap canh a: ");
            a = sc.nextInt();
        }
        this.a = a;
    }

    public void SetCanhB(int b)
    {
        while(b <= 0)
        {
            System.out.println("Nhap canh b: ");
            b = sc.nextInt();
        }
        this.b = b;
    }

    public void SetCanhC(int c)
    {
        while(c <= 0)
        {
            System.out.println("Nhap canh c: ");
            c = sc.nextInt();
        }
        this.c = c;
    }

    public int GetCanhA()
    {
        return a;
    }

    public int GetCanhB()
    {
        return b;
    }

    public int GetCanhC()
    {
        return c;
    }

    public int chuvi()
    {
        return a + b + c;
    }

    public double dientich()
    {
        float p = (a + b + c) / 2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    public void nhap()
    {
        SetCanhA(0);
        SetCanhB(0);
        SetCanhC(0);
    }
}

public static void main(String[] args) 
{
    TamGiac tg = new TamGiac();
    tg.nhap();
    System.out.println(tg.chuvi());
}

