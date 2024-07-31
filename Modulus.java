import java.util.Scanner;
public class Modulus{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a,b;
        a=read.nextInt();
        b=read.nextInt();
        int c=a%b;
        System.out.println(c);
    }
}