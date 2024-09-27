import java.util.Scanner;
public class menu 
{
    public static void main(String[] args) 
    {
        int choice = 1;
        while(choice != 0)
        {
            System.out.println("1.Do dai cua s");
            System.out.println("2.Xoa bo khoang trang thua cua s");
            System.out.println("3.Dem so tu cua s va xuat moi tu nam tren 1 dong");
            System.out.println("4.Nhap so tu nhien k, xuat k ki tu cua ke tu vi tri khong");
            System.out.println("5.Nhap so tu nhien k, n, xuat n ki tu cua s ke tu vi tri khong");
            System.out.println("6.Tim xem trong xau co ton tai chuoi st nhap tu ban phim hay khong");
            System.out.println("0.Thoat");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap chuoi: ");
            String s = scanner.nextLine();
            System.out.println("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice) 
            {
                case 1:
                    break;
                case 2:
                    khoangtrang(s);
                    break;
                case 3:
                    break;
                case 4:
                    xuat_k_kitu(s);
                    break;
                case 5:
                    xuat_k_n_kitu(s);
                    break;
                case 6:
                    kiem_tra_ton_tai(s);
                    break;
                default:
                System.out.println("Khong hop le!");
            }
        }
    }

    public static void dodai(String s)
    {
        int dem = 0;
        for(var i : s.toCharArray())
            dem++;
        System.out.println("Do dai cua chuoi la " + dem);
    }

    public static void khoangtrang(String s)
    {
        s = s.trim();
        for(int i = 0; i < s.length(); i++)
        {
            char kitu = s.charAt(i);
            if(Character.isWhitespace(kitu))
            {
                s = removeCharAt(s, i);
            }
        }
        System.out.println(s);
    }

    public static String removeCharAt(String s, int pos) 
    {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void dem_xuat(String s)
    {
        int dem = 0;
        khoangtrang(s);
        for(int i = 0; i < s.length(); i++)
        {
            char kitu = s.charAt(i);
            System.out.println(kitu);
        }
        System.out.println("So tu cua chuoi: " + dem);
    }

    public static void xuat_k_kitu(String s) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap k: ");
        int k = scanner.nextInt();
        while(k > s.length())
        {
            System.out.println("k lon hon do dai chuoi nhap lai k: ");
            k = scanner.nextInt();
        }

        System.out.println("k ki tu ben trai cua chuoi: ");
        for(int i = 0; i < k; i++)
        {
            char kitu = s.charAt(i);
            System.out.println(kitu);
        }

        System.out.println("k ki tu ben phai cua chuoi: ");
        for(int i = s.length() - 1; i >= s.length() - k; i--)
        {
            char kitu = s.charAt(i);
            System.out.println(kitu);
        }
    }

    public static void xuat_k_n_kitu(String s) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap k: ");
        int k = scanner.nextInt();
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();

        System.out.println("Xuat n ki tu cua chuoi ke tu vi tri k: ");
        int i = k;
        while(n > 0)
        {
            char kitu = s.charAt(i);
            System.out.println(kitu);
            i++;
            n--;
        }
    }

    public static void kiem_tra_ton_tai(String s) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi st: ");
        String st = scanner.nextLine();
        if(s.contains(st))
            System.out.println("Co ton tai");
        else 
            System.out.println("Khong ton tai");
    }
}
