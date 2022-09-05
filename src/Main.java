import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int r,a;
        double field;
        double pi=3.14;
        System.out.println("yarıçapı giriniz");
        r=scanner.nextInt();
        System.out.println("açıyı giriniz");
        a=scanner.nextInt();
        field=(pi*r*r*a)/360;
        System.out.println(field);
    }
}
