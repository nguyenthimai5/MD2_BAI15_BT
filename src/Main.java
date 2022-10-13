import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTringle {

    Scanner scanner=new Scanner(System.in);
    float a=0;
    float b=0;
    float c=0;
       try {
        System.out.println("Nhap canh a:");
        a=Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap canh b:");
        b=Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap canh c:");
        c=Float.parseFloat(scanner.nextLine());
    }catch (Exception exception){
        System.err.println("Vui long nhap dang so");
    }

        if (a+b<c||a+c<b||b+c<a){
        throw new IllegalTringle("Day khong phai ba canh cua mot tam giac");
    }else {
        System.out.println("Day la ba canh cua mot tam giac");
    }
}
}