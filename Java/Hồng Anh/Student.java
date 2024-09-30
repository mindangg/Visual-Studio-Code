
import java.util.Scanner;



public class Student{
    private String name;
    private float fee;
    private static float total = 0;
    Scanner sc = new Scanner(System.in);

    public Student()
    {

    }


    public Student(String name, float fee, float total) 
    {
        this.name = name;
        this.fee = fee;
        this.total += this.fee;
    }

    public String GetName() 
    {
        return name;
    }

    public float GetFee() 
    {
        return fee;
    }

    public static float GetTotal() 
    {
        return total;
    }

    public void SetName(String name) 
    {
        this.name = name;
    }

    public void SetFee(float fee) 
    {
        this.fee = fee;
    }

    public void SetTotal(float fee) 
    {
        this.total += fee;
    }


    private void Nhap()
    {
        System.out.println("Nhap ten sinh vien: ");
        SetName(sc.nextLine());
        System.out.println("Nhap hoc phi sinh vien: ");
        SetFee(sc.nextFloat());
        SetTotal(this.fee);
    }

    private void Xuat()
    {
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Hoc phi sinh vien: " + fee);
        System.out.println("Tong hoc phi sinh vien: " + total);
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Student sv1 = new Student();
        Student sv2 = new Student();
        Student sv3 = new Student();

        sv1.Nhap();
        sv1.Xuat();
        
    }

}