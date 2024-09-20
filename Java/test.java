import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s = scanner.nextLine();
        if(!a(s))
        {
            System.out.println("Nhap lai chuoi: ");
            s = scanner.nextLine();
        }
        else if(!b(s))
        {
            System.out.println("Nhap lai chuoi: ");
            s = scanner.nextLine();  
        }
        else if(!c(s))
        {
            System.out.println("Nhap lai chuoi: ");
            s = scanner.nextLine();  
        }
        else
            System.out.println(s);
        scanner.close();
    }

    public static boolean a(String s){
        return s.startsWith("DCT") || s.startsWith("DKP");
    }

    public static boolean b(String s){
        return s.length() == 8;
    }

    public static boolean c(String s){
        String s1 = s.substring(3);
        try{
            Integer.parseInt(s1);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
